package com.ozkin.practicamarket.persistence;

import com.ozkin.practicamarket.domain.Product;
import com.ozkin.practicamarket.domain.repository.ProductRepository;
import com.ozkin.practicamarket.persistence.crud.ProductoCRUDRepository;
import com.ozkin.practicamarket.persistence.entity.Producto;
import com.ozkin.practicamarket.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ProductoRepository implements ProductRepository {
    private ProductoCRUDRepository productoCRUDRepository;
    private ProductMapper mapper;

    @Override
    public List<Product> getAll(){
        List<Producto> productos = (List<Producto>) productoCRUDRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getCategoryById(int categoryId) {
        List<Producto> productos = productoCRUDRepository.findByIdCategoriaOrderByNameAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        Optional<List<Producto>>productos = productoCRUDRepository.findByCantidadStockLessThanAndEstado(quantity,true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        productoCRUDRepository.findById(productId).map(producto -> mapper.toProduct(producto));
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCRUDRepository.save(producto)
        );
    }



    @Override
    public void delete(int productId){
        productoCRUDRepository.deleteById(productId);
    }
}
