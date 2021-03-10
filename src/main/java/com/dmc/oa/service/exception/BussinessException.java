package com.dmc.oa.service.exception;

public class BussinessException extends RuntimeException{

    //编写异常编码
    private String code;
    //一场文本
    private String message;
    public BussinessException(String code , String msg){
        super(code + ":" + msg);
        this.code = code;
        this.message = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
