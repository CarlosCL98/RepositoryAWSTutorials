package edu.eci.DynamicWebSite.Service.Impl;

import edu.eci.DynamicWebSite.Dao.UserDao;
import edu.eci.DynamicWebSite.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.DynamicWebSite.Service.DynamicWebSiteService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DynamicWebSiteServiceImpl implements DynamicWebSiteService {

    private Map<Integer, User> userMap = new HashMap<>();

    @Autowired
    private UserDao userDao;

    @Override
    public int getNextMaxId() {
        return userMap.size() + 1;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        userMap.put(user.getId(), user);
        userDao.saveUser(user);
    }
}
