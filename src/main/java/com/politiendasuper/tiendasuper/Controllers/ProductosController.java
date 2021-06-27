package com.politiendasuper.tiendasuper.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.politiendasuper.tiendasuper.BLL.productosBLL;
import com.politiendasuper.tiendasuper.DAL.productosDAL;
import com.politiendasuper.tiendasuper.models.productosModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductosController {
    
    @Autowired
    productosBLL productosBLL;

    @GetMapping()
    public ArrayList<productosModel> productos()
    {
        return  productosBLL.getproductos();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<productosModel> idproducto(@PathVariable("id") int id)
    {
        return productosBLL.getproductosid(id);
    }

    @PostMapping()
    public productosModel ingresarproducto(@RequestBody productosModel producto)
    {
        return productosBLL.ingresarproducto(producto);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean deleteidproducto(@PathVariable("id") int id)
    {
        return productosBLL.eliminardato(id);
    }

    @PutMapping(path = "/{id}")
    public productosModel actualizaridproducto(@PathVariable("id") int id, @RequestBody productosModel producto)
    {   
        return productosBLL.actualizarproducto(id, producto);
    }


}
