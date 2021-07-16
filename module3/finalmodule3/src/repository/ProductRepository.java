package repository;

import model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    void save(Product product);

    List<Product> findByName(String productName);

    Product update(int productId, Product product);

    void remove (int productId);

    Product findById(int productId);
}
