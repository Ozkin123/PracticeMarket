package com.ozkin.practicamarket.persistence;

import com.ozkin.practicamarket.domain.Purchase;
import com.ozkin.practicamarket.domain.repository.PurchaseRepository;
import com.ozkin.practicamarket.persistence.crud.CompraCRUDRepository;
import com.ozkin.practicamarket.persistence.entity.Compra;
import com.ozkin.practicamarket.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCRUDRepository compraCRUDRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCRUDRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getById(String clienteId) {
        return compraCRUDRepository.findByIdCliente(clienteId).map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));
        return mapper.toPurchase(compraCRUDRepository.save(compra));
    }
}
