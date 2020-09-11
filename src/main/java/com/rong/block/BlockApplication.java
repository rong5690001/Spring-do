package com.rong.block;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.rong.block", exclude = DataSourceAutoConfiguration.class)
public class BlockApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockApplication.class, args);
    }

}
