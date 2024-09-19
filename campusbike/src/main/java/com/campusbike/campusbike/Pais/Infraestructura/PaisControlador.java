package com.campusbike.campusbike.Pais.Infraestructura;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusbike.campusbike.Pais.Dominio.IPais;
import com.campusbike.campusbike.Pais.Dominio.Pais;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/pais")
public class PaisControlador {

    @Autowired
    IPais paisServicio;

    @GetMapping("/obtener/{id}")
    public Pais obtenerPais(@PathVariable long id) {
        Optional<Pais> pais = paisServicio.findPaisById(id);

        if (pais.isPresent()) {

            return pais.get();
        }

        return null;
        
    }

    @PostMapping("/guardarPais")
    public String crearPais(@Valid @RequestBody Pais pais) {
        
        List<Pais> paisEncontrado = paisServicio.encontrarPaisPorNombre(pais.getNombre());

        if (paisEncontrado.size()==0) {
            paisServicio.createPais(pais);
            return "Pais guardado exitosamente";
        } else if (paisEncontrado.size() > 0) {
            
            return "Este pais ya está registrado";
        } else {
            return "Error a registrar pais";
        }
    }

    @PostMapping("/borrarPais")
    public String borrarPais(@Valid @RequestBody Pais pais) {

        List<Pais> paisEncontrado = paisServicio.encontrarPaisPorNombre(pais.getNombre());

        if (paisEncontrado.size()==0) {
            paisServicio.borrarPais(paisEncontrado.get(0));
            return "Pais borrado exitosamente";
        } else {
            
            return "Error al borrar el pais";
        }

    }
    
    

}
