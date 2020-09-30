package com.tianyisoft.dao;

import com.tianyisoft.po.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ProductDao {
    List<Product> getProductsBy(Product product);
    List<Product> getProductsBy2(Product product);
    int updateProduct(Product product);
    List<Product> foreachTest(Map<String, Object> map);
}
