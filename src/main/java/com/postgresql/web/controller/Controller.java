package com.postgresql.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // define la clase como un rescontroller
@RequestMapping("/saludar")
public class Controller {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola mundito";
    }

    @GetMapping("chao")
    public String despedir() {
        return "Adios!!!";
    }
}
