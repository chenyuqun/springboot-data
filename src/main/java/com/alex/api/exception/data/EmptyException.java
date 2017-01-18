package com.alex.api.exception.data;

import com.alex.api.exception.core.MyException;

/**
 * Function:
 *
 * @author Alex
 * @date 2017/1/18
 */
public class EmptyException extends MyException {

    public EmptyException() {
        super(ErrorCodeFields.EMPTY_ERROR);
    }
}
