package com.tianyisoft.po;

import java.util.List;

public class Order {
    private Integer id;
    private String sn;
    private List<Product> productList;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", productList=" + productList +
                '}';
    }
}
