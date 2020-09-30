package com.tianyisoft;

import com.tianyisoft.controller.*;
import com.tianyisoft.po.User;
import com.tianyisoft.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class Application {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // UserController uc = ctx.getBean(UserController.class);
        // uc.execute();
        // OneToOneController oto = ctx.getBean(OneToOneController.class);
        // oto.test();
        // ManyToManyController mtm = ctx.getBean(ManyToManyController.class);
        // mtm.test();
        // DynamicSqlController dsc = ctx.getBean(DynamicSqlController.class);
        // dsc.test();
        InfinityTreeController itc = ctx.getBean(InfinityTreeController.class);
        itc.test();
    }
}
