package com.HSOB.TestesSpringBoot.controller;

import com.HSOB.TestesSpringBoot.model.Character;
import com.HSOB.TestesSpringBoot.repository.CharacterRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST de Estudos")
@CrossOrigin(origins = "*")
public class CharacterController {
    @Autowired//impostação do repositori e poder utiliar os metodos apra conectar no banco de dados
    private CharacterRepository characterRepository;

    @GetMapping("/character")//retorna a collection inteira
    @ApiOperation(value = "Restorna uma lista de personagens")
    public List<Character> lisAll(){
        return characterRepository.findAll();
    }

    @GetMapping("/character/{id}")//retorna pelo id
    @ApiOperation(value = "Restorna um unico personagem")
    public Optional<Character> listForId(@PathVariable(value = "id") Long id){
        return characterRepository.findById(id);
    }

//    @GetMapping("characer/{login}")
//    public Optional<CharacterModel> listLogin(@PathVariable(value = "login") String login){
//        return characterRepository.findByLogin(login);
//    }


    @PostMapping(path = "/character/save")
    @ApiOperation(value = "Salva um unico personagem")
    public Character save(@RequestBody Character characterModel){
        return characterRepository.save(characterModel);
    }

    @DeleteMapping("/character")
    @ApiOperation(value = "Deleta um personagem")

    public void delete(@RequestBody Character characterModel){
        characterRepository.delete(characterModel);
    }

    @PutMapping("/character")
    @ApiOperation(value = "Atualiza um personagem")

    public Character putCharacter(@RequestBody Character characterModel){
        return characterRepository.save(characterModel);
    }

}
