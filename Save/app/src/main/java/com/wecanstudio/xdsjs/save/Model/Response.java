package com.wecanstudio.xdsjs.save.Model;

/**
 * Created by xdsjs on 2015/11/20.
 */
public class Response {
    private String status;
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
