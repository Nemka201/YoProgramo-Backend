/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author nemka201
 */
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String desdeHastaE;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombre, String descripcion, String desdehasta) {
        this.id = id;
        this.nombreE = nombre;
        this.descripcionE = descripcion;
        this.desdeHastaE = desdehasta;
    }
    
    //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombre) {
        this.nombreE = nombre;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcion) {
        this.descripcionE = descripcion;
    }
    
    public String getDesdehastaE() {
        return desdeHastaE;
    }
    
    public void setDesdehastaE(String desdehasta) {
        this.desdeHastaE = desdehasta;
    }
}
