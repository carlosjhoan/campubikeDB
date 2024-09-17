package com.campusbike.campusbike.Ciudad.Application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campusbike.campusbike.Ciudad.Dominio.Ciudad;
import com.campusbike.campusbike.Ciudad.Dominio.ICiudad;
import com.campusbike.campusbike.Ciudad.Infrastructure.CiudadRepository;
import com.campusbike.campusbike.Pais.Dominio.Pais;

@Service
public class Ciudadimplementacion implements ICiudad {

    @Autowired
    CiudadRepository ciudadRepository;

    @Override
    public void createCiudad(Ciudad ciudad) {
        
        ciudadRepository.save(ciudad);

    }

    @Override
    public boolean deletePaisById(String nombre) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Pais> encontrarPaisPorNombre(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Ciudad> findCiudadById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    


}
