package com.windspear.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application  {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(Application.class);
//        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }



}