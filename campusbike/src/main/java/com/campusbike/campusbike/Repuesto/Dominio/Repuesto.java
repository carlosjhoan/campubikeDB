package com.campusbike.campusbike.Repuesto.Dominio;

import com.campusbike.campusbike.Compra.Dominio.Compra;
import com.campusbike.campusbike.Marca.Dominio.Marca;
import com.campusbike.campusbike.Modelo.Dominio.Modelo;
import com.campusbike.campusbike.Proveedores.Dominio.Proveedor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Repuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private long id;

    @Column(columnDefinition = "varchar(100)")
    private String nombre;

    @Column(columnDefinition = "varchar(200)")
    private String descripcion;

    @Column(columnDefinition = "int")
    private int stock;

    @Column(columnDefinition = "decimal(10, 2)")
    private Float precio;

    @ManyToOne
    @JoinColumn(name = "proveedorId")
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "modeloId")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "marcaId")
    private Marca marca;

}
