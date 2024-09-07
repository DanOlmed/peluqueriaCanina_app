package ar.com.peluqueriacanina.Model;

import ar.com.peluqueriacanina.Model.Mascota;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-07T15:33:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> hora;
    public static volatile SingularAttribute<Turno, Mascota> mascota;
    public static volatile SingularAttribute<Turno, Date> dia;
    public static volatile SingularAttribute<Turno, Integer> idTurno;

}