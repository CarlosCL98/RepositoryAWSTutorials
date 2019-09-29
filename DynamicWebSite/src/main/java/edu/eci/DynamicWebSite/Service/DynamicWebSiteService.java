package edu.eci.DynamicWebSite.Service;

import edu.eci.DynamicWebSite.Model.User;

import java.util.List;

public interface DynamicWebSiteService {

    int getNextMaxId();

    List<User> getAllUsers();

    void saveUser(User user);
}
