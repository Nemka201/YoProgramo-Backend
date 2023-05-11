package com.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.Id;



@Entity
@Table(name ="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min=1,max=30,message ="No cumple con la longitud")
    private String nombre;

    @NotBlank
    @Size(min=1,max=30,message ="No cumple con la longitud")
    private String apellido;

    @Size(min=0,max=100,message ="No cumple con la longitud")
    private String imagen;
    
    // Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return imagen;
    }

    public void setImg(String img) {
        this.imagen = img;
    }
    
    
}
