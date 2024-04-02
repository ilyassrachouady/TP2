package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nom;
    Date date;
    int score;

    public Patient(Long o, String ilyass, Date date, int score) {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}


