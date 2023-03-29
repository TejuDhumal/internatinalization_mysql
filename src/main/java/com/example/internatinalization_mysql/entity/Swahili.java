package com.example.internatinalization_mysql.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Swahili {

    private String jina;
    private String maoni;


    public String getJina() {
        return jina;
    }

    public void setJina(String jina) {
        this.jina = jina;
    }

    public String getMaoni() {
        return maoni;
    }

    public void setMaoni(String maoni) {
        this.maoni = maoni;
    }
}
