package com.tianyisoft.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties("handler")
public class Tree implements Serializable {
    private Integer id;
    private String name;
    private Integer pid;
    private Tree parent;
    private List<Tree> children;
}
