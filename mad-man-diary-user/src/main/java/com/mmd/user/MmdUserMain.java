package com.mmd.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xch
 * @description
 * @date 2020-05-06
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MmdUserMain {
    public static void main(String[] args) {
        SpringApplication.run(MmdUserMain.class, args);
    }
}
