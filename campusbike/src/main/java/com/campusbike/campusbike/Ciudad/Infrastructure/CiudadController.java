package com.campusbike.campusbike.Ciudad.Infrastructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.campusbike.campusbike.Ciudad.Dominio.Ciudad;
import com.campusbike.campusbike.Ciudad.Dominio.ICiudad;
import com.campusbike.campusbike.Pais.Dominio.IPais;
import com.campusbike.campusbike.Pais.Dominio.Pais;

import java.util.List;
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
    @ResponseBody
    public String crearCiudad(@RequestBody Ciudad ciudad) {
        
        Long paisId = ciudad.getPaisId();

        Optional<Pais> optPais = paisServicios.findPaisById(paisId);

        if(optPais.isPresent()) {
            String nombreCiudad = ciudad.getNombre();
            Pais pais = optPais.get();
            List<Ciudad> listCiudades = ciudadServicios.encontrarTodasCiudades();
            for (Ciudad eachCiudad : listCiudades) {
                if (eachCiudad.getNombre().equals(nombreCiudad) && eachCiudad.getPais().getId() == paisId) {
                   
                    return "Esta ciudad ya se encuentra registrada";
                }
                
                
            }

            if (nombreCiudad.trim().length() == 0) {
                
                return "No se permite nombre de ciudad vacío";
            }
            
            ciudad.setPais(pais);
            ciudadServicios.createCiudad(ciudad);
            return "Ciudad Creado exitosamente";
        }
        
        return "Error al guardar pais";
    }
    

}
