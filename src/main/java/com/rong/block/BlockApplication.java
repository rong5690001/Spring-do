package com.rong.block;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.rong.block", exclude = DataSourceAutoConfiguration.class)
//@EnableJpaRepositories(basePackages = "com.rong.block.data")
//@EntityScan(basePackages = "com.rong.block.pojo")
public class BlockApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockApplication.class, args);
    }

}
