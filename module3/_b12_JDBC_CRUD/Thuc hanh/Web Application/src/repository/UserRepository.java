package repository;

import model.User;

import java.awt.*;
import java.util.List;

public interface UserRepository {

    List<User> findAll();

    void save(User user);

    List<User> findByName(String name);

    User update(int id, User user);

    void remove(int id);

    User findById(int id);

    List<User> findByCountry (String Country);

    List<User> sort();
}
