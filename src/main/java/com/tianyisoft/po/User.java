package com.tianyisoft.po;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String name;
    private String sex;

    private List<Order> orderList;
}
