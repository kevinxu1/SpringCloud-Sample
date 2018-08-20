package com.kevin.cloud.department.service.client;


import com.kevin.cloud.user.api.UserAPI;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Kevin.xu
 * @date 2018/8/6/0:37
 * @description : 用户服务客户端
 */
@FeignClient(value = "SERVICE-USER-HI",path = "/user")
public interface UserFeginClient extends UserAPI {


}
