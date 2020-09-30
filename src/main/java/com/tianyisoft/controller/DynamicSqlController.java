package com.tianyisoft.controller;

import com.tianyisoft.dao.ProductDao;
import com.tianyisoft.po.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DynamicSqlController {
    private final ProductDao productDao;

    public DynamicSqlController(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void test() {
        Product p = new Product();
        p.setName("桃");
        p.setPrice(2);
        System.out.println(productDao.getProductsBy(p));
        System.out.println(productDao.getProductsBy2(p));

        Product p2 = new Product();
        p2.setName("桃");
        System.out.println(productDao.getProductsBy(p2));
        System.out.println(productDao.getProductsBy2(p2));

        Product p3 = new Product();
        p3.setPrice(2);
        System.out.println(productDao.getProductsBy(p3));
        System.out.println(productDao.getProductsBy2(p3));

        Product p4 = new Product();
        System.out.println(productDao.getProductsBy(p4));
        System.out.println(productDao.getProductsBy2(p4));

        Product p5 = new Product();
        p5.setId(1);
        p5.setName("核桃");
        p5.setPrice(22);
        System.out.println(productDao.updateProduct(p5));

        Map<String, Object> map = new HashMap<>();
        map.put("ids", new Integer[]{1, 2, 3});
        List<Integer> prices = new ArrayList<>();
        prices.add(20);
        prices.add(22);
        map.put("prices", prices);
        System.out.println(productDao.foreachTest(map));
    }
}
