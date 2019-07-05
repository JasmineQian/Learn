package com.example.demo.bean;

import com.example.demo.config.Message;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class ResponseBean<T> {

    @JsonIgnore
    private boolean ok(){return this.code.equalsIgnoreCase(Message.SUCCESS_CODE);}

    public ResponseBean(){
        this.code=Message.SUCCESS_CODE;
        this.msg=Message.SUCCESS_MESSAGE;
    }


    public ResponseBean(T data){
        this.code=Message.SUCCESS_CODE;
        this.msg=Message.SUCCESS_MESSAGE;
        this.data=data;
    }

    private String msg;
    private String code;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
