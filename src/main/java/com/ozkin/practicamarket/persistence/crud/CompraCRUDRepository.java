package com.ozkin.practicamarket.persistence.crud;

import com.ozkin.practicamarket.persistence.entity.Compra;
import com.ozkin.practicamarket.persistence.entity.ComprasProducto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCRUDRepository extends CrudRepository<Compra,Integer> {
    Optional<List<Compra>> findByIdCliente(String idCliente);

}
