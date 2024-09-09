package com.campusbike.campusbike.DetallesCompra.Dominio;

import com.campusbike.campusbike.Compra.Dominio.Compra;
import com.campusbike.campusbike.Marca.Dominio.Marca;
import com.campusbike.campusbike.Modelo.Dominio.Modelo;
import com.campusbike.campusbike.Repuesto.Dominio.Repuesto;

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
public class DetallesCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private long id;

    @ManyToOne
    @JoinColumn(name = "repuestoId")
    private Repuesto repuesto;

    @ManyToOne
    @JoinColumn(name = "compraId")
    private Compra compra;

    @Column(columnDefinition = "int")
    private int cantidad;

    @Column(columnDefinition = "decimal(10, 2)")
    private Float precio_unitario;

}
