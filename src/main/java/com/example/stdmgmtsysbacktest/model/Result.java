package com.example.stdmgmtsysbacktest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
    @Id
    private Integer id;
    private String name;
    private Float result;

    public Result(Integer id, String name, Float result){
        this.id = id;
        this.name = name;
        this.result = result;
    }
    public Result(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }
}
