package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.controllers;

import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain.Fruita;
import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.services.IFruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ApiController {

    @Autowired
    private IFruitaService service;

    @GetMapping("/getOne")
    public Optional<Fruita> getOneApi(@RequestParam int id){
        return service.getOne(id);
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id){
        service.delete(id);
        return "done";
    }

    @GetMapping("getAll")
    public List<Fruita> getAll(){
        return service.getAll();
    }

    @PostMapping("add")
    public String add(@RequestParam int id, @RequestParam String nom, @RequestParam int quilos){
        service.save(new Fruita(id,nom,quilos));
        return "Done";
    }


}
