package service;

import model.User;
import repository.UserRepository;
import repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository repository = new UserRepositoryImpl();

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(User user) {
        repository.save(user);

    }

    @Override
    public  List<User> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void update(int id, User user) {
        repository.update(id,user);
    }


    @Override
    public void remove(int id) {
        repository.remove(id);
    }

    @Override
    public User findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<User> findByCountry(String country) {
        return repository.findByCountry(country);
    }

    @Override
    public List<User> sort() {
        return repository.sort();
    }
}
