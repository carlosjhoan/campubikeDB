package com.campusbike.campusbike.Compra.Dominio;

import java.util.Date;

import com.campusbike.campusbike.Cliente.Dominio.Cliente;
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
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private long id;

    @Column(columnDefinition = "date")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "proveedorId")
    private Proveedor proveedor;

}
