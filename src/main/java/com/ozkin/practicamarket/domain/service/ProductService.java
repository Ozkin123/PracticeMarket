package com.ozkin.practicamarket.domain.service;

import com.ozkin.practicamarket.domain.Product;
import com.ozkin.practicamarket.domain.repository.ProductRepository;
import com.ozkin.practicamarket.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProduct (int productId){
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId){
        return productRepository.getCategoryById(categoryId);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public boolean  delete(int productId){
        return getProduct(productId).map(product ->{
                productRepository.delete(productId);
                return true;}).orElse(false);

    }


}
