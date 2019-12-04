package io.geewit.core.exception;

import org.springframework.http.HttpStatus;

/**
 * 未知的异常
 * @author geewit
 */
@SuppressWarnings({"unused"})
public class UnknownException extends CustomizedException implements ErrorCode {
    public UnknownException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
        this.code = ErrorCode.UNKNOWN_ERROR;
    }

    public UnknownException(String message) {
        this(message, HttpStatus.OK);
    }

    public UnknownException(String message, String code) {
        this(message, code, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public UnknownException(String message, String code, HttpStatus httpStatus) {
        super(message, httpStatus);
        this.code = code;
    }

    private String code;

    @Override
    public String getCode() {
        return code;
    }
}