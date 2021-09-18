package com.HSOB.TestesSpringBoot.repository;

import com.HSOB.TestesSpringBoot.model.CharacterModel;
import org.springframework.data.repository.CrudRepository;
//suficiente para as consultas basicas no banco
public interface CharacterRepository extends CrudRepository<CharacterModel, Integer> {
}
