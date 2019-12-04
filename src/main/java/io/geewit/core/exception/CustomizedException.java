package io.geewit.core.exception;



/**
 * @author geewit
 * @since  2017/4/15
 */
@SuppressWarnings({"unused"})
public abstract class CustomizedException extends RuntimeException {
    public CustomizedException(String message) {
        super(message);
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public CustomizedException(String message, int httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }


    private int httpStatus;

    public int getHttpStatus() {
        return httpStatus;
    }
}
