package com.kevin.cloud.user.model;

import com.alibaba.fastjson.JSON;

/**
 * 用户实体
 * Created by Kevin.xu
 */
public class User {
    private String id;
    //用户名
    private String username;
    //用户性别
    private String sex;
    //电话
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
