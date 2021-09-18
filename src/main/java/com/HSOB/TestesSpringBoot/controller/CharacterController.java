package com.HSOB.TestesSpringBoot.controller;

import com.HSOB.TestesSpringBoot.model.CharacterModel;
import com.HSOB.TestesSpringBoot.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CharacterController {
    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping(path = "/api/character/{codigo}")
    public ResponseEntity consult(@PathVariable("codigo") Integer code){
        return characterRepository.findById(code)
                .map(record -> ResponseEntity.ok(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CharacterModel save(@RequestBody CharacterModel characterModel){
        return characterRepository.save(characterModel);
    }
}
