package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findByName(String productName) {
        return productRepository.findByName(productName);
    }

    @Override
    public Product update(int productId, Product product) {
        return productRepository.update(productId,product);
    }

    @Override
    public void remove(int productId){
        productRepository.remove(productId);
    }

    @Override
    public Product findById(int productId) {
        return productRepository.findById(productId);
    }
}
