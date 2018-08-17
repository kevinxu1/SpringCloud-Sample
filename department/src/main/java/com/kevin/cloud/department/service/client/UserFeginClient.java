package com.kevin.cloud.department.service.client;

import com.kevin.cloud.user.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Kevin.xu
 * @date 2018/8/6/0:37
 * @description : 用户服务客户端
 */
@FeignClient(value = "SERVICE-USER-HI",path = "/user")
public interface UserFeginClient {

  @RequestMapping(value = "/{username}", method = RequestMethod.GET)
  User getUser(@PathVariable(name = "username") String username);

}
