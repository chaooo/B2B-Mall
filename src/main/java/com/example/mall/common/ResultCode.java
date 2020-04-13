package com.example.mall.common;

/**
 * 枚举了一些常用API操作码
 *
 * @author : Charles
 * @date : 2020/4/13
 */
public enum ResultCode{
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");


    /**
     * 状态码
     */
    private long code;
    /**
     * 状态信息
     */
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }
    public long getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
