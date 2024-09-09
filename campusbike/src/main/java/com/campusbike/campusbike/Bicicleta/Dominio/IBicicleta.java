package com.campusbike.campusbike.Bicicleta.Dominio;

import java.util.List;
import java.util.Optional;


public interface IBicicleta {

    void crearBicicleta(Bicicleta bicicleta);
    Optional<Bicicleta> encontrarBicicletaPorId(Long id);
    List<Bicicleta> encontrarTodas();
    void borrarBiciletaPorId(long id);

}
