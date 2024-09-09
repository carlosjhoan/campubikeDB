package com.campusbike.campusbike.Pais.Aplicacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campusbike.campusbike.Pais.Dominio.IPais;
import com.campusbike.campusbike.Pais.Dominio.Pais;
import com.campusbike.campusbike.Pais.Infraestructura.PaisRepository;

@Service
public class PaisImplementacio implements IPais{

    @Autowired PaisRepository paisRepository;

    @Override
    public void createPais(Pais pais) {

        paisRepository.save(pais);
    
    }

    @Override
    public void borrarPais(Pais pais) {


        paisRepository.delete(pais);

    }

    @Override
    public Optional<Pais> findPaisById(Long id) {
        
        return paisRepository.findById(id);
    }

    @Override
    public List<Pais> encontrarPaisPorNombre(String nombre) {
        
        return paisRepository.findByNombre(nombre);
    }

    

    

}
