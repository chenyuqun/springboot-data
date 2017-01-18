package com.alex.api.exception.data;

import com.alex.api.exception.core.IErrorCode;

public enum ErrorCodeFields implements IErrorCode {
    /**
     * 系统异常
     */
    SYSTEM_ERROR("500", "system error"),
    /**
     * 数据为空
     */
    EMPTY_ERROR("101","查询不到商品"),
    ;
    private String errorCode;

    private String errorMsg;

    private ErrorCodeFields(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ErrorCodeFields setErrorMsgAndReturn(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }
}
