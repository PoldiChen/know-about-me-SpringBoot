package com.poldichen.knowaboutme.entity;

/**
 * @author poldi.chen
 * @className Resp
 * @description TODO
 * @date 2019/3/23 12:59
 **/
public class Resp {

    private int code;
    private String message;
    private Object data;

    public Resp() {
        this.code = 0;
        this.message = "OK";
        this.data = null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
