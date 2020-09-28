package com.tianyisoft.controller;

import com.tianyisoft.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ManyToManyController {
    private final OrderDao orderDao;

    public ManyToManyController(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void test() {
        System.out.println(orderDao.orderWithProducts());
    }
}
