package com.mmd.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xch
 * @description 网关启动类
 * @date 2020-04-26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MmdGatewayMain {
    public static void main(String[] args) {
        SpringApplication.run(MmdGatewayMain.class, args);
    }
}
