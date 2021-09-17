package com.HSOB.TestesSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/api/status")//endereço chamado
    public String check(){
        return "H.S.O.B. Online";
    }
}
