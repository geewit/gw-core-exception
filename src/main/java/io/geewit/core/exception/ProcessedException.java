package io.geewit.core.exception;

import org.springframework.http.HttpStatus;

/**
 * 处理过的异常
 * @author geewit
 */
@SuppressWarnings({"unused"})
public class ProcessedException extends CustomizedException {
    protected ProcessedException(String message, String code) {
        super(message, HttpStatus.OK);
        this.code = code;
    }


    private String code;

    public String getCode() {
        return code;
    }
}