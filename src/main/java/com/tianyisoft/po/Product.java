package com.tianyisoft.po;

import java.util.List;

public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private List<Order> orderList;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", orderList=" + orderList +
                '}';
    }
}
