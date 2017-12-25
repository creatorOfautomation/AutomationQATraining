package com.exception;

/**
 * Created by Мужик on 20.12.2017.
 */
public class DivisionOnZeroException extends Exception {

    public DivisionOnZeroException() {
    }

    public DivisionOnZeroException(String message) {
        super(message);
    }

    public DivisionOnZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionOnZeroException(Throwable cause) {
        super(cause);
    }

    public DivisionOnZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
