/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author nemka201
 */
public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String desdehastaE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String desdehastaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.desdehastaE = desdehastaE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    public String getDesdehastaE() {
        return desdehastaE;
    }

    public void setDesdehastaE(String desdehastaE) {
        this.desdehastaE = desdehastaE;
    }
}
