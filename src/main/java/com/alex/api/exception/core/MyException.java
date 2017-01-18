package com.alex.api.exception.core;

/**
 * Function:通用异常类
 *
 * @author Alex
 * @date 2017/1/17
 */
public class MyException extends Exception {
    /** 异常码 */
    private IErrorCode errorCode;

    /**
     * 异常描述。
     */
    private String description;

    protected MyException() {
    }

    public MyException(IErrorCode errorCode) {
        this(errorCode, null);
    }

    public MyException(String code, String desc) {
        this.errorCode = new ErrorCode(code, desc);
        description = desc;
    }

    public MyException(String description, IErrorCode errorCode) {
        this(errorCode.getErrorCode(), description);
    }



    public MyException(String description, IErrorCode errorCode, Throwable cause) {
        this(errorCode, cause);
        this.description = description;
    }

    public MyException(IErrorCode errorCode, Throwable cause) {
        super(cause);
        if (errorCode == null) {
            throw new java.lang.IllegalArgumentException("error code could not null.");
        }
        this.errorCode = errorCode;
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String getMessage() {
        return "errorCode=" + this.errorCode.getErrorCode() + ",errorMsg=" + this.errorCode.getErrorMsg();
    }

}
