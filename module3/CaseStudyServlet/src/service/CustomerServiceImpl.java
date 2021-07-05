package service;

import model.Customer;
import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> findByName(String customerName) {
        return customerRepository.findByName(customerName);
    }

    @Override
    public Customer update(int customerId, Customer customer) {
        return customerRepository.update(customerId,customer);
    }

    @Override
    public void remove(int customerId) {
        customerRepository.remove(customerId);
    }

    @Override
    public Customer findById(int customerId) {
        return customerRepository.findById(customerId);
    }
}
