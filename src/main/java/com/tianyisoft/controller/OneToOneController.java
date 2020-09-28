package com.tianyisoft.controller;

import com.tianyisoft.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OneToOneController {
    private final PersonDao personDao;

    public OneToOneController(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void test() {
        System.out.println(personDao.findById(1));
        System.out.println(personDao.findById2(1));
        System.out.println(personDao.findById3(1));
    }
}
