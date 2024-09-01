
package ar.com.peluqueriacanina.Persistence;

import ar.com.peluqueriacanina.Model.Duenio;
import ar.com.peluqueriacanina.Model.Mascota;
import ar.com.peluqueriacanina.Model.Usuario;
import ar.com.peluqueriacanina.Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraDePersistencia {
    
    MascotaJpaController mascotaJpa= new MascotaJpaController();
    DuenioJpaController duenioJpa=new DuenioJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpa.create(duenio);
        mascotaJpa.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        
        return mascotaJpa.findMascota(num_cliente);
        
    }

    public void modificarMascota(Mascota mascota) {
        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int idDuenio) {
        return duenioJpa.findDuenio(idDuenio);
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }

   

    
    
    
    
    
}
