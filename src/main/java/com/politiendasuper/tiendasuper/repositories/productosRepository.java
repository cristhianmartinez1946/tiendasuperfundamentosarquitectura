package com.politiendasuper.tiendasuper.repositories;

import com.politiendasuper.tiendasuper.models.productosModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productosRepository extends CrudRepository<productosModel, Integer> {
    
}
