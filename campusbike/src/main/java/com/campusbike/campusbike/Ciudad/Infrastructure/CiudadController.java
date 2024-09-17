package com.campusbike.campusbike.Ciudad.Infrastructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusbike.campusbike.Ciudad.Dominio.Ciudad;
import com.campusbike.campusbike.Ciudad.Dominio.ICiudad;
import com.campusbike.campusbike.Pais.Dominio.IPais;
import com.campusbike.campusbike.Pais.Dominio.Pais;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/ciudad")
public class CiudadController {

    @Autowired
    ICiudad ciudadServicios;

    @Autowired
    IPais paisServicios;

    @PostMapping("/guardarCiudad")
    public String crearCiudad(@RequestBody Ciudad ciudad) {
        
        Long paisId = ciudad.getPaisId();

        Optional<Pais> optPais = paisServicios.findPaisById(paisId);

        if(optPais.isPresent()) {
            ciudad.setPais(optPais.get());
            ciudadServicios.createCiudad(ciudad);
            return "Ciudad Creado exitosamente";
        }
        
        return "Error al guardar pais";
    }
    

}
