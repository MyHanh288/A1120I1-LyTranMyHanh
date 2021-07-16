package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    List<Product> findByName(String productName);

    Product update(int productId, Product product);

    void remove (int productId);

    Product findById(int productId);
}
