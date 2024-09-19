package com.campusbike.campusbike.Ciudad.Dominio;

import java.util.List;
import java.util.Optional;

import com.campusbike.campusbike.Pais.Dominio.Pais;

public interface ICiudad {

    void createCiudad(Ciudad ciudad);
    Optional <Ciudad> findCiudadById(Long id);
    boolean deletePaisById(String nombre);
    List<Pais> encontrarPaisPorNombre(String nombre);
    List<Ciudad> encontrarTodasCiudades();

}
