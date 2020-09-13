package com.rong.block.data.impl;

import com.rong.block.pojo.Ingredient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JdbcIngredientRepositoryTest {

    @Autowired
    private JdbcIngredientRepository jdbcIngredientRepository;

    @Test
    void findAll() {
        jdbcIngredientRepository.findAll().forEach(ingredient -> {
            System.out.println(ingredient.toString());
        });
    }

    @Test
    void findOne() {
        System.out.println(jdbcIngredientRepository.findOne("FLTO").toString());
    }

    @Test
    void save() {
        Ingredient ingredient = new Ingredient("root", "榕哥", Ingredient.Type.WRAP);
        System.out.println(jdbcIngredientRepository.save(ingredient).toString());
    }
}