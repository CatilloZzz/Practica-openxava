package ni.edu.uam.Facturacion.model;

import lombok.*;
import org.openxava.annotations.*;
import javax.persistence.*;
@Entity
@Getter@Setter
public class Cliente {
    @Id
    @Column(length = 6)
    int numero;


    @Id
    @Column(length = 50)
    String nombre;


}
