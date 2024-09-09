package com.campusbike.campusbike.Bicicleta.Aplicacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campusbike.campusbike.Bicicleta.Dominio.Bicicleta;
import com.campusbike.campusbike.Bicicleta.Dominio.IBicicleta;
import com.campusbike.campusbike.Bicicleta.Infraestructura.BicicletaRepositorio;
import com.campusbike.campusbike.Marca.Infraestructura.MarcaRepositorio;
import com.campusbike.campusbike.Modelo.Infraestructura.ModeloRepositorio;

@Service
public class BicicletaImplementacion implements IBicicleta{

    @Autowired
    BicicletaRepositorio bicicletaRepositorio;

    @Autowired
    ModeloRepositorio modeloRepositorio;

    @Autowired
    MarcaRepositorio marcaRepositorio;

    @Override
    public void borrarBiciletaPorId(long id) {
        
        bicicletaRepositorio.deleteById(id);
        
    }

    @Override
    public void crearBicicleta(Bicicleta bicicleta) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<Bicicleta> encontrarBicicletaPorId(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public List<Bicicleta> encontrarTodas() {
        // TODO Auto-generated method stub
        return null;
    }

    

}
