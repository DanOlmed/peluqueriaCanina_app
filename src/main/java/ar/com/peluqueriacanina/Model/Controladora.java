
package ar.com.peluqueriacanina.Model;

import ar.com.peluqueriacanina.Persistence.ControladoraDePersistencia;
import java.util.List;


public class Controladora {
    
   ControladoraDePersistencia controlPers=new ControladoraDePersistencia();

    public void guardar(String nombre, String color, 
            String raza, String nombreDuenio, String celDuenio, 
            String alergico, String atEspecial, String observaciones) {
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
               
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setColor(color);
        mascota.setDuenio(duenio);
        
        controlPers.guardar(duenio,mascota);
    }

    public List<Mascota> traerMascotas() {
        
        
        return controlPers.traerMascotas();
       
    }

    public void borrarMascota(int num_cliente) {
       controlPers.borrarMascota(num_cliente);
    }
   
   
    
}
