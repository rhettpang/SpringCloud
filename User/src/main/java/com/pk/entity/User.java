package com.pk.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Created by pangkunkun on 2018/10/25.
 */
public class User implements Serializable {

    /**
     * id
     * */
    private int id;

    /**
     * 用户id
     * */
    private String userId;

    /**
     * 用户名称
     * */
    private String username;

    /**
     * 用户性别 : 1（男），2（女），0（未知）
     * */
    private int sex;

    private Date createdTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", createdTime=" + createdTime +
                '}';
    }
}
