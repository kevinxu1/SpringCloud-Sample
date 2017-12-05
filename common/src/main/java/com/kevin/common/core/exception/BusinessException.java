package com.kevin.common.core.exception;

import java.text.MessageFormat;

/**
 * 定义一个异常接口
 * Created by Kevin.xu
 */
public interface BusinessException {
    //获取异常code
    String getCode();

    //获取异常信息
    String getMessage();

    String setMessage(String message);

    default BusinessException value(String... value) {
        this.setMessage(MessageFormat.format(this.getMessage(), value));
        return this;
    }


}
