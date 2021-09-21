package com.HSOB.TestesSpringBoot.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Entity
@Document(collection = "products")
public class Aluminum {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(nullable = false, length = 11)
    public Integer user;
    @Column(nullable = false)
    public String type;
    @Column(nullable = false)
    public Float weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(nullable = false)
    public String description;
}
