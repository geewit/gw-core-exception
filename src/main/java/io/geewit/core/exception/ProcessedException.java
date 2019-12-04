package io.geewit.core.exception;

/**
 * 处理过的异常
 * @author geewit
 */
@SuppressWarnings({"unused"})
public class ProcessedException extends CustomizedException implements ErrorCode {
    public ProcessedException(String message, int httpStatus) {
        super(message, httpStatus);
        this.code = ErrorCode.UNKNOWN_ERROR;
    }

    public ProcessedException(String message) {
        this(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ProcessedException(String message, String code) {
        this(message, code, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ProcessedException(String message, String code, int httpStatus) {
        super(message, httpStatus);
        this.code = code;
    }


    private String code;

    @Override
    public String getCode() {
        return code;
    }
}