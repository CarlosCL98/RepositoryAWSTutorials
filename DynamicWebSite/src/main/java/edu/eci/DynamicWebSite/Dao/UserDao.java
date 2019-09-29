package edu.eci.DynamicWebSite.Dao;

import edu.eci.DynamicWebSite.Model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

}
