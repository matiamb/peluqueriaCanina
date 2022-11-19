
package com.yoprogramo.peluqueriacanina.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_Cliente;
    private String nombre_Perro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atencion_especial;
    private String observaciones;
    @OneToOne
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int num_Cliente, String nombre_Perro, String raza, String color, boolean alergico, boolean atencion_especial, String observaciones, Duenio unDuenio) {
        this.num_Cliente = num_Cliente;
        this.nombre_Perro = nombre_Perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getNum_Cliente() {
        return num_Cliente;
    }

    public String getNombre_Perro() {
        return nombre_Perro;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public boolean isAtencion_especial() {
        return atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setNum_Cliente(int num_Cliente) {
        this.num_Cliente = num_Cliente;
    }

    public void setNombre_Perro(String nombre_Perro) {
        this.nombre_Perro = nombre_Perro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public void setAtencion_especial(boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

    
    
    
}
