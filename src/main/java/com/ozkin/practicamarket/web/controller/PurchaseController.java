package com.ozkin.practicamarket.web.controller;

import com.ozkin.practicamarket.domain.Purchase;
import com.ozkin.practicamarket.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/getpurchase")
    public ResponseEntity<List<Purchase>> getAll(){
         return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getpurchase{clienteId}")
    public ResponseEntity<List<Purchase>> getById(@PathVariable String clienteId){
        return purchaseService.getById(clienteId).map(purchases -> new ResponseEntity<>(purchases,HttpStatus.CREATED))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/purchase")
    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.save(purchase),HttpStatus.CREATED);
    }

}
