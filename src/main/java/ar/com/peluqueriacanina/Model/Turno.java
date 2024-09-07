package ar.com.peluqueriacanina.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idTurno;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dia;
    private String hora;
    @OneToOne
    private Mascota mascota;

    public Turno() {
    }

    public Turno(int idTurno, Date dia, String hora, Mascota mascota) {
        this.idTurno = idTurno;
        this.dia = dia;
        this.hora = hora;
        this.mascota = mascota;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    
    
    
    
    
}
