package com.tianyisoft.pojo;

public class UserWithOrders {
    private Integer id;
    private String name;
    private String sex;
    private Integer order_id;
    private String sn;

    @Override
    public String toString() {
        return "UserWithOrders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", order_id=" + order_id +
                ", sn='" + sn + '\'' +
                '}';
    }
}
