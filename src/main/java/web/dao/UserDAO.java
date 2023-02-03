package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDAO {
    void add(User user);
    public List<User> getUsers();
    public User getOneUser(int id);
    void delete(int id);
    void update(int id, User user);

}
