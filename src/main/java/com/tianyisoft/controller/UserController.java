package com.tianyisoft.controller;

import com.tianyisoft.po.User;
import com.tianyisoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @Transactional
    public void execute() {
        User user1 = service.find(1);
        System.out.println(user1);
        System.out.println(service.get());
        User iu = new User();
        iu.setId(2);
        iu.setName("test");
        iu.setSex("男");
        System.out.println(service.create(iu));
        // System.out.println(service.create(User.builder().id(2).name("test").sex("男").build()));
        User nu = new User();
        nu.setName("autoId");
        nu.setSex("男");
        System.out.println(service.createWithoutId(nu));
        System.out.println(nu.getId());
        user1.setSex("女");
        System.out.println(service.update(user1));
        System.out.println(service.delete(2));
        System.out.println(service.byName("es"));
        System.out.println(service.mapTest());
        System.out.println(service.pojoTest());
        System.out.println(service.findWithOrders(1));
        System.out.println(service.findWithOrders2(1));
        System.out.println(service.findWithOrders3(1));
        System.out.println(service.findWithOrders4(1));
    }
}
