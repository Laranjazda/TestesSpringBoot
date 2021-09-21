package com.HSOB.TestesSpringBoot.controller;

import com.HSOB.TestesSpringBoot.model.Aluminum;
import com.HSOB.TestesSpringBoot.repository.AluminumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AluminumController {
    @Autowired
    private AluminumRepository aluminumRepository;

    @GetMapping("/aluminum")
    public List<Aluminum> listAll(){
        return aluminumRepository.findAll();
    }

}
