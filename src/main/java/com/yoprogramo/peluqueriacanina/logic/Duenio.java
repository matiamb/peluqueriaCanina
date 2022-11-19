
package com.yoprogramo.peluqueriacanina.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Duenio;
    private String nombre;
    private String celular;
    private String direccion;

    public Duenio() {
    }

    public Duenio(int id_Duenio, String nombre, String celular, String direccion) {
        this.id_Duenio = id_Duenio;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }

    public int getId_Duenio() {
        return id_Duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId_Duenio(int id_Duenio) {
        this.id_Duenio = id_Duenio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
