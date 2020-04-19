package com.base;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private Integer code;
    private String msg;
    private T data;

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse() {
    }

    public static BaseResponse SUCCESS(){
        return new BaseResponse(200,"OK",null);
    }
    public static BaseResponse SUCCESS(Object data){
        return new BaseResponse(200,"OK",data);
    }

    public static BaseResponse FAIL(){
        return new BaseResponse(500,"服务器繁忙",null);
    }
    public static BaseResponse FAIL(String msg){
        return new BaseResponse(500,msg,null);
    }
}
