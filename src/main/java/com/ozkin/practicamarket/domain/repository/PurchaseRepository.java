package com.ozkin.practicamarket.domain.repository;

import com.ozkin.practicamarket.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional<List<Purchase>> getById(String clienteId);
    Purchase save(Purchase purchase);

}
