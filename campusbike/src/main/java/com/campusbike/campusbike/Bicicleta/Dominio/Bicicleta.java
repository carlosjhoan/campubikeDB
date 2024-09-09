package com.campusbike.campusbike.Bicicleta.Dominio;

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
public class Bicicleta {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private long id;

    @ManyToOne
    @JoinColumn(name = "modeloId")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "marcaId")
    private Marca marca;

    @Column(columnDefinition = "decimal(10, 2)")
    private Float precio;

    @Column(columnDefinition = "int")
    private int stock;



}
