package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getOneUser(int id);
    void delete(int id);
    void update(int id, User user);

//    User getUserByCar(String model, int series);
}
