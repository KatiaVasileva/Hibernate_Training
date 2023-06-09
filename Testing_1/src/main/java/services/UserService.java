package services;

import dao.UserDAO;
import dao.UserDAOImpl;
import models.Auto;
import models.User;

import java.util.List;

public class UserService {

    private UserDAO usersDAO = new UserDAOImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDAO.findById(id);
    }

    public void saveUser(User user) {
        usersDAO.save(user);
    }

    public void updateUser(User user) {
        usersDAO.update(user);
    }

    public void deleteUser(User user) {
        usersDAO.delete(user);
    }

    public List<User> findAllUsers() {
        return usersDAO.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDAO.findAutoById(id);
    }

}
