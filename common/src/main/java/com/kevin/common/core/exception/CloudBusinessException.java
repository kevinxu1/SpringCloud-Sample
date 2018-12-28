package com.kevin.common.core.exception;

/**
 * Created by Kevin.xu
 */
public class CloudBusinessException extends Exception {
    private String code;
    private String message;

    public CloudBusinessException(BusinessException businessException) {
        super(businessException.getMessage());
        this.code = businessException.getCode();
        this.message = businessException.getMessage();
    }

    public CloudBusinessException(String message) {
        super(message);
        this.message = message;
    }
}
