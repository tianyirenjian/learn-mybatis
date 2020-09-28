package com.tianyisoft.pojo;

import java.util.List;

public class SelectUserWithOrders {
    private Integer id;
    private String name;
    private String sex;
    private List<Order> orderList;

    @Override
    public String toString() {
        return "SelectUserWithOrders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}

class Order {
    private Integer id;
    private String sn;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                '}';
    }
}
