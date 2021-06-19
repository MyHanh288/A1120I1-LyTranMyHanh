package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements  CustomerRepository{
    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Nguyen Van Binh", "binhnv@gmail.com", "Da Nang"));
        customerList.add(new Customer(2,"Nguyen Thanh Xuan", "xuan123@gmail.com", "Quang Nam"));
        customerList.add(new Customer(3,"Tran Xuan Hung", "hungtx@gmail.com", "Hue"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerList.set(id, customer);
    }

    @Override
    public void remove(int id) {
        customerList.remove(id);
    }
}
