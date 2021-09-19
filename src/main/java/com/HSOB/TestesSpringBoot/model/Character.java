package com.HSOB.TestesSpringBoot.model;

import lombok.Generated;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;

@Entity//entou dizendo que essa classe é uma entidade do banco de dados
@Document(collection = "character")

public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Gera automaticamente o Id
    public Long id;

    @Column(nullable = false, length = 50)
    public String name;
    @Column(nullable = false, length = 20)
    public String gender;
    @Column(nullable = false, length = 20)
    public String login;
    @Column(nullable = false, length = 20)
    public String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
