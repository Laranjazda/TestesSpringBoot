package com.HSOB.TestesSpringBoot.repository;

import com.HSOB.TestesSpringBoot.model.Aluminum;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AluminumRepository extends MongoRepository<Aluminum, Long> {
    Optional<Aluminum> findById(Long id);
}
