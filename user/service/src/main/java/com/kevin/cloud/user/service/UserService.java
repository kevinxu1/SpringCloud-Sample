package com.kevin.cloud.user.service;

import com.kevin.common.core.exception.CloudBusinessException;
import com.kevin.cloud.user.api.model.User;

/**
 * 用户服务
 * Created by Kevin.xu
 */
public interface UserService {
    /**
     * 新增一个用户信息
     *
     * @param user 用户实体
     */
    void addUser(User user) throws CloudBusinessException;

    /**
     * 修改用户信息
     *
     * @param user
     */
    void updateUser(User user) throws CloudBusinessException;

    /**
     * 根据用户名称，获取用户信息
     *
     * @param username
     */
    User getUserByUserName(String username) throws CloudBusinessException;

}
