package com.campusbike.campusbike.Marca.Infraestructura;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbike.campusbike.Marca.Dominio.Marca;
import java.util.List;


public interface MarcaRepositorio extends JpaRepository<Marca, Long> {

    List<Marca> findByNombre(String nombre);

}
