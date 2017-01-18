package com.alex.api.exception.core;

/**
 * Function:错误码
 *
 * @author Alex
 * @date 2017/1/18
 */
public class ErrorCode implements IErrorCode {

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorMsg;

    public ErrorCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errorMsg;
    }
}
