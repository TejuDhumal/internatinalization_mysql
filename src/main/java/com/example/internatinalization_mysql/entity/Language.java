package com.example.internatinalization_mysql.entity;

import jakarta.persistence.*;

@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String language;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "firstName", column = @Column(name = "NameEn")),
            @AttributeOverride( name = "feedback", column = @Column(name = "feedbackEn"))})

    private English en;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "jina", column = @Column(name = "NameSw")),
            @AttributeOverride( name = "maoni", column = @Column(name = "feedbackSw"))})

    private Swahili sw;

    public English getEn() {
        return en;
    }

    public void setEn(English en) {
        this.en = en;
    }

    public Swahili getSw() {
        return sw;
    }

    public void setSw(Swahili sw) {
        this.sw = sw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
