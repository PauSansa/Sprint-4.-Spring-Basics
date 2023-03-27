package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t01.n01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class HelloWorldController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/HelloWorld2/{nom}")
    public String saluda2(@PathVariable int id){
        return "Saluda2";

    }

}
