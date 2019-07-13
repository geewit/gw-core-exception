package io.geewit.core.exception;

import org.springframework.http.HttpStatus;

/**
 * 处理过的异常
 * @author geewit
 */
@SuppressWarnings({"unused"})
public class ProcessedException extends CustomizedException {
    public ProcessedException(String message) {
        super(message, HttpStatus.OK);
        this.code = ErrorCode.UNKNOWN_ERROR;
    }

    public ProcessedException(String message, String code) {
        this(message);
        this.code = code;
    }


    private String code;

    public String getCode() {
        return code;
    }
}