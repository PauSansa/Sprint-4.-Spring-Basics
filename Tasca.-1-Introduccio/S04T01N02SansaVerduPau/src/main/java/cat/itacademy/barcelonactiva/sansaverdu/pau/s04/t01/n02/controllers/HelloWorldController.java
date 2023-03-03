package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t01.n02.controllers;


import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWK") String nom){
        return "Hola "+nom+" estas executant un programa Gradle";
    }

    @GetMapping(value = {"/HelloWorld2","/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom){
        if (Objects.isNull(nom)) {
            nom = "UNKNOWN";
        }
        return "Hola "+ nom + " estas executant un projecte Gradle";
    }
}
