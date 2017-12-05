package com.kevin.cloud.user.repository;

import com.kevin.cloud.user.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Kevin.xu
 */
@Repository
public interface UserRepository {
    /**
     * 新增一个用户信息
     *
     * @param user 用户实体
     */
    void addUser(User user);

    /**
     * 修改用户信息
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据用户名称，获取用户信息
     *
     * @param username
     */
    User getUserByUserName(String username);
}
