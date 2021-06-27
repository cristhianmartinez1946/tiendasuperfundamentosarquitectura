package com.politiendasuper.tiendasuper.BLL;

import java.util.ArrayList;
import java.util.Optional;

import com.politiendasuper.tiendasuper.DAL.productosDAL;
import com.politiendasuper.tiendasuper.models.productosModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class productosBLL {
    
    @Autowired
    productosDAL produstosDAL;

    public ArrayList<productosModel> getproductos()
    {
        return produstosDAL.Getlistaproductos();
    }

    public Optional<productosModel> getproductosid(int id)
    {
        return produstosDAL.getproductoid(id);
    }    

    public productosModel ingresarproducto(productosModel producto)
    {
        return produstosDAL.crearproducto(producto);
    }    
    
    public Boolean eliminardato(int id)
    {
        return produstosDAL.eliminardato(id);
    }  
    
    public productosModel actualizarproducto(int id, productosModel producto)
    {
        producto.setCodigo(id);
        return produstosDAL.Actualizarproducto(producto);
    }    



}
