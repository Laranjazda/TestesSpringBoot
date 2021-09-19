package com.HSOB.TestesSpringBoot.repository;

import com.HSOB.TestesSpringBoot.model.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
//responsavel pelos métodos que acessam o banco de dados
//suficiente para as consultas basicas no banco
//MongoRepository ja possui varios metodos prontos para fazer pesquisas no banco
public interface CharacterRepository extends MongoRepository<Character, Long> {
    //metodo que produra um unico produto pelo ID
    Optional<Character> findById(Long id);
    Optional<Character> findByLogin(String login);
}
