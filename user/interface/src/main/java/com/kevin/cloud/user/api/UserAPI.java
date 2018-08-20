package com.kevin.cloud.user.api;

import com.kevin.cloud.user.api.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UserAPI {

  @RequestMapping(value = "/{username}", method = RequestMethod.GET)
   User getUser(@PathVariable(name = "username") String username);


  @RequestMapping(method = RequestMethod.PUT)
   User updateUser(@RequestBody User user);
}
