package com.HSOB.TestesSpringBoot.repository;

import com.HSOB.TestesSpringBoot.model.CharacterModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
//suficiente para as consultas basicas no banco
public interface CharacterRepository extends MongoRepository<CharacterModel, Integer> {
}
