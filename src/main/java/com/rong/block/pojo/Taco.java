package com.rong.block.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private String name;
    private Date createdAt;

    private List<Ingredient> ingredients;
}
