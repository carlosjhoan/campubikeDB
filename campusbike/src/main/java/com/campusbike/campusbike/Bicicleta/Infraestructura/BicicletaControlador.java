package com.campusbike.campusbike.Bicicleta.Infraestructura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusbike.campusbike.Bicicleta.Dominio.Bicicleta;
import com.campusbike.campusbike.Bicicleta.Dominio.IBicicleta;
import com.campusbike.campusbike.Marca.Dominio.IMarca;
import com.campusbike.campusbike.Modelo.Dominio.IModelo;
import com.campusbike.campusbike.Pais.Dominio.Pais;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/bicicleta")
public class BicicletaControlador {

    @Autowired
    IBicicleta bicicletaServicios;

    @Autowired
    IModelo modeloServicios;

    @Autowired
    IMarca marcaServicios;

    @PostMapping("/guardarBicicleta")
    void crearBicileta(@Valid @RequestBody Bicicleta bicicleta) {
        
        bicicletaServicios.crearBicicleta(bicicleta);

    }
    

}
