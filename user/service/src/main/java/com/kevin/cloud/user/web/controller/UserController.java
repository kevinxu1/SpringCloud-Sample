package com.kevin.cloud.user.web.controller;

import com.kevin.cloud.user.api.model.User;
import com.kevin.cloud.user.service.UserService;
import com.kevin.common.core.exception.CloudBusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kevin.xu
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public User getUser(@PathVariable String username) {
        try {
            return userService.getUserByUserName(username);
        } catch (CloudBusinessException e) {
            logger.error("getUser Error", e);
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        try {
            userService.addUser(user);
        } catch (CloudBusinessException e) {
            logger.error("addUser Error", e);
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user) {
        try {
            userService.updateUser(user);
        } catch (CloudBusinessException e) {
            logger.error("updateUser Error", e);
        }
        return null;
    }


}
