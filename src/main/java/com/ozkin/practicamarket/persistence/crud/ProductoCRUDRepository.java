package com.ozkin.practicamarket.persistence.crud;

import com.ozkin.practicamarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCRUDRepository extends CrudRepository<Producto,Integer> {
   List<Producto> findByIdCategoriaOrderByNameAsc (int idCategoria);

   Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
   


}
