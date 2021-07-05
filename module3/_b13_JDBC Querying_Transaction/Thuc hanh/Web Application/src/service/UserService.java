package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    List<User> findByName(String name);

    void update(int id, User user);

    void remove(int id);

    User findById(int id);

    List<User> findByCountry(String country);

    List<User> sort();

}
