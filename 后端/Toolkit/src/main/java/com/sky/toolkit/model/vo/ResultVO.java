package com.sky.toolkit.model.vo;

import com.sky.toolkit.enums.StatusCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.sky.toolkit.enums.StatusCodeEnum.FAIL;
import static com.sky.toolkit.enums.StatusCodeEnum.SUCCESS;

/***
 @author sky
 @date 2022/10/22
 @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("all")
public class ResultVO<T> {

    private Boolean flag;

    private Integer code;

    private String message;

    private T data;

    public static <T> ResultVO<T> ok() {
        return resultVO(true, SUCCESS.getCode(), SUCCESS.getDesc(), null);
    }

    public static <T> ResultVO<T> ok(T data) {
        return resultVO(true, SUCCESS.getCode(), SUCCESS.getDesc(), data);
    }

    public static <T> ResultVO<T> ok(T data, String message) {
        return resultVO(true, SUCCESS.getCode(), message, data);
    }

    public static <T> ResultVO<T> fail() {
        return resultVO(false, FAIL.getCode(), FAIL.getDesc(), null);
    }

    public static <T> ResultVO<T> fail(StatusCodeEnum statusCodeEnum) {
        return resultVO(false, statusCodeEnum.getCode(), statusCodeEnum.getDesc(), null);
    }

    public static <T> ResultVO<T> fail(String message) {
        return resultVO(false, message);
    }

    public static <T> ResultVO<T> fail(T data) {
        return resultVO(false, FAIL.getCode(), FAIL.getDesc(), data);
    }

    public static <T> ResultVO<T> fail(T data, String message) {
        return resultVO(false, FAIL.getCode(), message, data);
    }

    public static <T> ResultVO<T> fail(Integer code, String message) {
        return resultVO(false, code, message, null);
    }

    private static <T> ResultVO<T> resultVO(Boolean flag, String message) {
        return ResultVO.<T>builder()
                .flag(flag)
                .code(flag ? SUCCESS.getCode() : FAIL.getCode())
                .message(message).build();
    }

    private static <T> ResultVO<T> resultVO(Boolean flag, Integer code, String message, T data) {
        return ResultVO.<T>builder()
                .flag(flag)
                .code(code)
                .message(message)
                .data(data).build();
    }

}

