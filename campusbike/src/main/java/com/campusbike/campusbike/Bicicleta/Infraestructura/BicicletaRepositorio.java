package com.campusbike.campusbike.Bicicleta.Infraestructura;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbike.campusbike.Bicicleta.Dominio.Bicicleta;

public interface BicicletaRepositorio extends JpaRepository<Bicicleta, Long> {

}
