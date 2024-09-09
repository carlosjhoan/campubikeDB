package com.campusbike.campusbike.Marca.Aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campusbike.campusbike.Marca.Dominio.IMarca;
import com.campusbike.campusbike.Marca.Dominio.Marca;
import com.campusbike.campusbike.Marca.Infraestructura.MarcaRepositorio;

@Service
public class MarcaImplementacion implements IMarca {

    @Autowired
    MarcaRepositorio marcaRepositorio;

    @Override
    public List<Marca> encontrarMarcaPorNombre(String nombre) {

            return marcaRepositorio.findByNombre(nombre);
    }

    


}
