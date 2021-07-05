package repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    void save(Customer customer);

    List<Customer> findByName(String customerName);

    Customer update(int customerId, Customer customer);

    void remove(int customerId);

    Customer findById(int customerId);

}
