package com.roykey.app;

import com.roykey.beans.CommonParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by roykey on 11/01/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = {CommonParameters.BASE_PACKAGE})
@EnableMongoRepositories(basePackages = {CommonParameters.BASE_PACKAGE})
public class CounterApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CounterApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CounterApp.class, args);
    }
}
