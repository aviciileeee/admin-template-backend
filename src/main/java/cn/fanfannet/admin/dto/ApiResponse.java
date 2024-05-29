package cn.fanfannet.admin.dto;

import lombok.Data;

@Data
public class ApiResponse<T> {

    private T data;
    private Integer code;
    private String msg;

    public ApiResponse(T data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public static <T>ApiResponse success(T data) {
        return new ApiResponse(data, 0, "");
    }
}
