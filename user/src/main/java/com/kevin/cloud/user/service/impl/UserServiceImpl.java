package com.kevin.cloud.user.service.impl;

import com.kevin.common.core.exception.CloudBusinessException;
import com.kevin.cloud.user.exception.UserException;
import com.kevin.cloud.user.model.User;
import com.kevin.cloud.user.repository.UserRepository;
import com.kevin.cloud.user.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Kevin.xu
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userReository;

    @Override
    public void addUser(User user) throws CloudBusinessException {
        vaildUser(user);
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        logger.info(user.toString());
        userReository.addUser(user);
    }


    @Override
    public void updateUser(User user) throws CloudBusinessException {
        vaildUser(user);
        if (StringUtils.isEmpty(user.getId())) {
            throw new CloudBusinessException(UserException.USER_ID_NULL);
        }
        userReository.updateUser(user);
    }

    @Override
    public User getUserByUserName(String username) throws CloudBusinessException {
        if (StringUtils.isEmpty(username)) {
            throw new CloudBusinessException(UserException.USER_NAME_NULL);
        }
        return userReository.getUserByUserName(username);
    }

    private void vaildUser(User user) throws CloudBusinessException {
        if (user == null) {
            throw new CloudBusinessException(UserException.USER_NULL);
        }
        if (StringUtils.isEmpty(user.getUsername())) {
            throw new CloudBusinessException(UserException.USER_NAME_NULL.value(user.getId()));
        }
        if (StringUtils.isEmpty(user.getSex())) {
            throw new CloudBusinessException(UserException.USER_SEX_NULL.value(user.getId(), user.getUsername()));
        }
    }
}
