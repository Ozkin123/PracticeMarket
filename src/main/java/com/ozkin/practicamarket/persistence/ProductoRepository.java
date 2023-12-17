package com.ozkin.practicamarket.persistence;

import com.ozkin.practicamarket.persistence.crud.ProductoCRUDRepository;
import com.ozkin.practicamarket.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCRUDRepository productoCRUDRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCRUDRepository.findAll();
    }

}
