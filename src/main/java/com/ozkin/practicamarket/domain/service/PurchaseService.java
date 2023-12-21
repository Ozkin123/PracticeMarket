package com.ozkin.practicamarket.domain.service;

import com.ozkin.practicamarket.domain.Purchase;
import com.ozkin.practicamarket.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getById(String clienteId){
        return purchaseRepository.getById(clienteId);
    }
    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }
}
