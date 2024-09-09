package com.campusbike.campusbike.Modelo.Aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campusbike.campusbike.Modelo.Dominio.IModelo;
import com.campusbike.campusbike.Modelo.Dominio.Modelo;
import com.campusbike.campusbike.Modelo.Infraestructura.ModeloRepositorio;

@Service
public class ModeloImplementacion implements IModelo{

    @Autowired
    ModeloRepositorio modeloRepositorio;

    @Override
    public List<Modelo> encontrarModeloPorNombre(String nombre) {
        
        return modeloRepositorio.findByNombre(nombre);
    }

    

}
