package com.politiendasuper.tiendasuper.DAL;

import java.util.ArrayList;
import java.util.Optional;

import com.politiendasuper.tiendasuper.models.productosModel;
import com.politiendasuper.tiendasuper.repositories.productosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productosDAL {
    
    @Autowired
    productosRepository productosRepository;

    public ArrayList<productosModel> Getlistaproductos()
    {
        return (ArrayList<productosModel>) productosRepository.findAll();
    }

    public Optional<productosModel> getproductoid(int id)
    {
        return productosRepository.findById(id);
    }

    public productosModel crearproducto(productosModel producto)
    {
        return productosRepository.save(producto);
    }

    public Boolean eliminardato(int id)
    {
        try{
            productosRepository.deleteById(id);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public productosModel Actualizarproducto(productosModel producto)
    {
        return productosRepository.save(producto);
    }

}