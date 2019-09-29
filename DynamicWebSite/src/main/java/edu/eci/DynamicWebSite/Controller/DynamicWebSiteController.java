package edu.eci.DynamicWebSite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.DynamicWebSite.Model.User;
import edu.eci.DynamicWebSite.Service.DynamicWebSiteService;

import java.util.List;

@RestController
public class DynamicWebSiteController {

    @Autowired
    private DynamicWebSiteService dynamicWebSiteService;

    @RequestMapping(value = "/maxNextId", method = RequestMethod.GET)
    public ResponseEntity<Integer> getNextMaxId() {
        return new ResponseEntity<>(dynamicWebSiteService.getNextMaxId(), HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = dynamicWebSiteService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        dynamicWebSiteService.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
