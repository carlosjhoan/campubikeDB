package com.campusbike.campusbike.Ciudad.Dominio;


import com.campusbike.campusbike.Pais.Dominio.Pais;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private long id;

    @Column(columnDefinition = "varchar(100)")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "paisId")
    private Pais pais;

    // @OneToMany(mappedBy = "ciudad", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    // private List<Cliente> clientes;
    

}
