package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.controllers;

import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain.Fruita;
import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.services.IFruitaService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class FruitaController {

    @Autowired
    private IFruitaService service;

    @GetMapping("/")
    public String home(Model model){
        System.out.println("Estoy aqui");
        return "index";
    }

    @GetMapping("/getOne/{id}")
    public String getOne(@PathVariable int id,Model model){
        Optional<Fruita> fruita = service.getOne(id);
        model.addAttribute("fruites",fruita.stream().toList());
        return "llista";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/getAll";
    }

    @GetMapping("/getAll")
    public String getAll(Model model){
        List<Fruita> fruites = service.getAll();
        model.addAttribute("fruites",fruites);
        return "llista";
    }

    @GetMapping("/add")
    public String agregar(Model model){
        model.addAttribute("Fruita", new Fruita());
        return "form";
    }
    @PostMapping("/save")
    public String save(@Validated Fruita f, Model model){
        service.save(f);
        return "redirect:/getAll";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable int id, Model model){
        Optional<Fruita> fruita= service.getOne(id);
        model.addAttribute("Fruita",fruita);
        return "form";
    }
}
