package com.yoprogramo.peluqueriacanina.logic;

import com.yoprogramo.peluqueriacanina.persistence.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombre, String raza, String color, String nombreduenio, String celduenio, 
            String observaciones, boolean alergia, boolean atencion) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreduenio);
        duenio.setCelular(celduenio);
                
        Mascota mascota = new Mascota();
        mascota.setNombre_Perro(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergia);
        mascota.setAtencion_especial(atencion);
        mascota.setObservaciones(observaciones);
        mascota.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascota() {
        return controlPersis.traerMascota();
    }

    public void borrarCliente(int num_Cliente) {
        controlPersis.borrarCliente(num_Cliente);
    }

    public Mascota traerMascota(int num_Cliente) {
        return controlPersis.traerMascota(num_Cliente);
    }

    public void modificarMascota(Mascota masco, String nombre, String raza, String color, 
            String nombreduenio, String celduenio, String observaciones, boolean alergia, boolean atencion) {
        masco.setNombre_Perro(nombre);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergia);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atencion);
        
        //como hago con el duenio? Por ahora, modificamos la mascota
        controlPersis.modificarMascota(masco);
        
        //Vamos con el duenio, creo un metodo para buscar duenio asi despues lo puedo reutilizar
        
        Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getId_Duenio());
        
        duenio.setNombre(nombreduenio);
        duenio.setCelular(celduenio);
        
        //Creo otro metodo para modificar el duenio, para reutilizar luego si es necesario
        this.modificarDuenio(duenio);
        
    }

    private Duenio buscarDuenio(int id_Duenio) {
        return controlPersis.traerDuenio(id_Duenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
    
}
