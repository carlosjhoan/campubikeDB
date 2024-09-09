package com.campusbike.campusbike.Modelo.Infraestructura;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbike.campusbike.Modelo.Dominio.Modelo;

public interface ModeloRepositorio extends JpaRepository<Modelo, Long> {

    List<Modelo> findByNombre(String nombre);



}
