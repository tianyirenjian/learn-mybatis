package com.tianyisoft.pojo;

import com.tianyisoft.po.IdCard;

public class SelectPersonById {
    private Integer id;
    private String name;
    private Integer idcard_id;
    private String code;

    @Override
    public String toString() {
        return "SelectPersonById{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idcard_id=" + idcard_id +
                ", code='" + code + '\'' +
                '}';
    }
}
