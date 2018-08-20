package com.kevin.cloud.user.exception;

import com.kevin.common.core.exception.BusinessException;

/**
 * Created by Kevin.xu
 */
public enum UserException implements BusinessException {
    USER_NULL("10801001", "用户对象为空!"),
    USER_NAME_NULL("10801002", "用户名为空，Id:{0}"),
    USER_SEX_NULL("10801003", "用户性别为空id:{0},name:{1}"),
    USER_ID_NULL("10801004", "用户Id为空");


    private String code;
    private String message;

    UserException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String setMessage(String message) {
        return this.message = message;
    }
}
