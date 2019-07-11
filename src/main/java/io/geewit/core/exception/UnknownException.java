package io.geewit.core.exception;

import org.springframework.http.HttpStatus;

/**
 * 未知的异常
 * @author geewit
 */
@SuppressWarnings({"unused"})
public class UnknownException extends CustomizedException {
    protected UnknownException(String message, String code) {
        super(message, HttpStatus.INTERNAL_SERVER_ERROR);
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }
}