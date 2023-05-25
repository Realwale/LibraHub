package net.walecode.librahub.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public String showHome(){
        return "index";
    }
}
