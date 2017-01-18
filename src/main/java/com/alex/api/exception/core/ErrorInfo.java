package com.alex.api.exception.core;

/**
 * Function: 实际返回的异常信息
 * 如果需要定义URL,自定义数据，可以进行扩展
 * @author Alex
 * @date 2017/1/17
 */
public class ErrorInfo {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
