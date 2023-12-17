package com.ozkin.practicamarket.persistence;

import com.ozkin.practicamarket.persistence.crud.ProductoCRUDRepository;
import com.ozkin.practicamarket.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCRUDRepository productoCRUDRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCRUDRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCRUDRepository.findByIdCategoriaOrderByNameAsc(idCategoria);
    }
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCRUDRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
}
