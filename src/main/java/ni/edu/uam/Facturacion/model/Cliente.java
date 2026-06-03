package ni.edu.uam.Facturacion.model;

import lombok.*;
import org.openxava.annotations.*;
import javax.persistence.*;

@Entity
@Getter @Setter
@View(name="Simple", members="numero, nombre")
public class Cliente {

    @Id
    @Column(length = 6)
    int numero;

    @Column(length = 50)
    @Required
    String nombre;

    @Embedded @NoFrame
    Direccion direccion;

}
