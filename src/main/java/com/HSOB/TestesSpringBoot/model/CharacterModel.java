package com.HSOB.TestesSpringBoot.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Document(collection = "character")
@Getter
@Entity(name = "characters")//entou dizendo que essa classe é uma entidade do banco de dados
public class CharacterModel {
    @Id
    public Integer characterId;
    @Column(nullable = false, length = 50)
    public String name;
    @Column(nullable = false, length = 20)
    public String gender;
    @Column(nullable = false, length = 20)
    public String login;
    @Column(nullable = false, length = 20)
    public String password;

//    public CharacterModel(Integer characterId, String name, String gender, String login, String password) {
//        this.characterId = characterId;
//        this.name = name;
//        this.gender = gender;
//        this.login = login;
//        this.password = password;
//    }

    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
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
