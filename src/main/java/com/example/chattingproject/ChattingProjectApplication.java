package com.example.chattingproject;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SwaggerDefinition
@EnableSwagger2
@Configuration
@SpringBootApplication
public class ChattingProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChattingProjectApplication.class, args);
    }

}
