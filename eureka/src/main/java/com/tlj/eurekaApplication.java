package com.tlj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.swing.*;

@SpringBootApplication
@EnableEurekaServer
public class eurekaApplication {
    public static void main(String[] args) {
        /**
         * 第一种
         */
        SpringApplication.run(eurekaApplication.class);


        /**
         *  第二种启动方式
         */
//        SpringApplication springApplication = new SpringApplication(eurekaApplication.class);
//        //关掉banner
//        //springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run();
    }
}
