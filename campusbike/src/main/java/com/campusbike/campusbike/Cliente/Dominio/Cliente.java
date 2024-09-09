package com.campusbike.campusbike.Cliente.Dominio;

import java.util.List;

import com.campusbike.campusbike.Ciudad.Dominio.Ciudad;
import com.campusbike.campusbike.Pais.Dominio.Pais;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private long id;

    @Column(columnDefinition = "varchar(100)")
    private String nombre;

    @Column(columnDefinition = "varchar(100)", unique = true)
    private String email;

    @Column(columnDefinition = "bigint", unique = true)
    private long telefono;

    @Column(columnDefinition = "varchar(100)", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "ciudadId")
    private Ciudad ciudad;


}
