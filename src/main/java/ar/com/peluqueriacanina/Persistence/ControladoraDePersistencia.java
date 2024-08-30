
package ar.com.peluqueriacanina.Persistence;

import ar.com.peluqueriacanina.Model.Duenio;
import ar.com.peluqueriacanina.Model.Mascota;
import java.util.List;


public class ControladoraDePersistencia {
    
    MascotaJpaController mascotaJpa= new MascotaJpaController();
    DuenioJpaController duenioJpa=new DuenioJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpa.create(duenio);
        mascotaJpa.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        
        return mascotaJpa.findMascotaEntities();
    }
    
    
    
}
