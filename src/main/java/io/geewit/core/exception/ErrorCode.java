package io.geewit.core.exception;

/**
 * 基础的错误代码
 * @author geewit
 */
@SuppressWarnings({"unused"})
public interface ErrorCode {
    String UNKNOWN_ERROR = "unknown";
    /**
     * 非法的参数
     */
    String INVALID_PARAMETERS = "invalid_parameters";
}
