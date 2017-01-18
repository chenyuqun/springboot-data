package com.alex.api.exception.handler;

import com.alex.api.exception.core.ErrorInfo;
import com.alex.api.exception.core.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Function: 统一错误类型
 *
 * @author Alex
 * @date 2017/1/17
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo jsonErrorHandler(MyException e) throws Exception {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setMessage(e.getErrorCode().getErrorMsg());
        errorInfo.setCode(e.getErrorCode().getErrorCode());
        return errorInfo;
    }

    /**
     * 默认 500 系统错误
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo defaultErrorHandler(){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setMessage("System error");
        errorInfo.setCode("500");
        return errorInfo;
    }
}
