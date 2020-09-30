package com.tianyisoft.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tianyisoft.dao.TreeDao;
import com.tianyisoft.po.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InfinityTreeController {
    private final TreeDao treeDao;

    public InfinityTreeController(TreeDao treeDao) {
        this.treeDao = treeDao;
    }

    public void test() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);

        Tree tree = treeDao.getTreeWithParent(13);
        String json = om.writeValueAsString(tree);
        System.out.println(json);

        Tree tree2 = treeDao.getTreeWithChildren(1);
        System.out.println(om.writeValueAsString(tree2));

        System.out.println(om.writeValueAsString(treeDao.getChildrenOf(0)));
    }
}
