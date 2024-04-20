package com.postgresql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Controller {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola mundito";
    }
}
