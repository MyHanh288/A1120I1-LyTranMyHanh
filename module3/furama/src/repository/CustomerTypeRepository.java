package repository;

import model.CustomerType;

import java.util.List;

public interface CustomerTypeRepository {
    List<CustomerType> findAll();

    CustomerType findById(String customerTypeId);
}
