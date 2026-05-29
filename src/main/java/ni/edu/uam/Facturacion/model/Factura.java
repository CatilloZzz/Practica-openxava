package ni.edu.uam.Facturacion.model;


import java.time.*;
import java.util.Collection;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
import org.openxava.calculators.*;
import lombok.*;

@Entity @Getter @Setter
@View(members=
        "año, numero, fecha;" +
                "cliente;" +
                "detalles;" +
                "observaciones")
public class Factura {

    @Id
    @GeneratedValue(generator="system-uuid")
    @Hidden
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @Column(length=32)
    String oid;

    @Column(length=4)
    @DefaultValueCalculator(CurrentYearCalculator.class)
    int año;

    @Column(length=6)
    int numero;

    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate fecha;

    @TextArea
    String observaciones;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @ReferenceView("Simple")
    Cliente cliente;


    @ElementCollection
    @ListProperties("producto.numero, producto.descripcion, cantidad")
    Collection<Detalle> detalles;


}
