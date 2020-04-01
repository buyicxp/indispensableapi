package com.buyi.indispensable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
@MapperScan("com.buyi.indispensable.dao/*")
@EnableScheduling
@EnableTransactionManagement
public class IndispensableApplication {

    public static void main(String[] args) {
        SpringApplication.run(IndispensableApplication.class, args);
    }


}
