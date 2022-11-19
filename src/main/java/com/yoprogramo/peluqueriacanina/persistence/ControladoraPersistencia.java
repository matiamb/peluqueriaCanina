package com.yoprogramo.peluqueriacanina.persistence;

import com.yoprogramo.peluqueriacanina.logic.Duenio;
import com.yoprogramo.peluqueriacanina.logic.Mascota;
import com.yoprogramo.peluqueriacanina.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpa.create(duenio);
        mascotaJpa.create(mascota);
    }

    public List<Mascota> traerMascota() {
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarCliente(int num_Cliente) {
        try {
            mascotaJpa.destroy(num_Cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_Cliente) {
        return mascotaJpa.findMascota(num_Cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_Duenio) {
       return duenioJpa.findDuenio(id_Duenio);
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
