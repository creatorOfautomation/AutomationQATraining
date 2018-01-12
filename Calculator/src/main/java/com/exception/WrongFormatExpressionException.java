package com.exception;

/**
 * Created by Мужик on 20.12.2017.
 */
public class WrongFormatExpressionException extends Exception {

    public WrongFormatExpressionException() {
    }

    public WrongFormatExpressionException(String message) {
        super(message);
    }

    public WrongFormatExpressionException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFormatExpressionException(Throwable cause) {
        super(cause);
    }

    public WrongFormatExpressionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
