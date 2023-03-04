package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKOWN") String nom){
        return "Hola "+ nom + " estas executant un projecte Maven";
    }

    @GetMapping("/HelloWorld2/{nom}")
    public String saluda2(@PathVariable(required = false) String nom){
        return "Hola "+ nom + " estas executant un projecte Maven";
    }
}
