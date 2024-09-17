package com.campusbike.campusbike.Ciudad.Infrastructure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbike.campusbike.Ciudad.Dominio.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

    List<Ciudad> findByNombre(String nombre);

     

}
