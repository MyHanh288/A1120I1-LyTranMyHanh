package service;

import model.CustomerType;
import repository.CustomerTypeRepository;
import repository.CustomerTypeRepositoryImpl;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    private CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();


    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(String customerTypeId) {
        return customerTypeRepository.findById(customerTypeId);
    }
}
