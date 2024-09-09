package com.campusbike.campusbike.Pais.Infraestructura;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbike.campusbike.Pais.Dominio.Pais;
import java.util.List;


public interface PaisRepository extends JpaRepository<Pais, Long>{

    List<Pais> findByNombre(String nombre);

}
