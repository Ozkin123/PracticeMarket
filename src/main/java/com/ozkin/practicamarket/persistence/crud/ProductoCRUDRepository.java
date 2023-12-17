package com.ozkin.practicamarket.persistence.crud;

import com.ozkin.practicamarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCRUDRepository extends CrudRepository<Producto,Integer> {
}
