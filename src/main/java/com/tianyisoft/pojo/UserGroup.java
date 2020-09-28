package com.tianyisoft.pojo;

import lombok.Data;

public class UserGroup {
    private String sex;
    private Integer count;

    @Override
    public String toString() {
        return "UserGroup{" +
                "sex='" + sex + '\'' +
                ", count=" + count +
                '}';
    }
}
