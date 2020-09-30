package com.tianyisoft.dao;

import com.tianyisoft.po.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TreeDao {
    Tree getTreeWithParent(Integer id);
    Tree getTreeWithChildren(Integer id);
    List<Tree> getChildrenOf(Integer id);
}
