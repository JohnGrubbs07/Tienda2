package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
   private Long idventa;
 private Long idfactura;
 private Long idproducto;
 private double precio;
 private int cantidad;

    @OneToMany
    @JoinColumn(name = "id_categoria", updatable = false)
    List<Producto> productos;

    public Venta() {
    }
    public Venta(Long idFactura, Long idProducto, double precio, int cantidad) {
        this.idfactura = idFactura;
        this.idproducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    }


