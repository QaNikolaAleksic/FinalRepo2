package com.projectname.api.client.data.model.crocodile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoginResponse implements Serializable {

    @SerializedName("refresh")
    @Expose
    private String refresh;
    @SerializedName("access")
    @Expose
    private String access;

    public LoginResponse() {
    }

    public LoginResponse(String refresh, String access) {
        super();
        this.refresh = refresh;
        this.access = access;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

}
