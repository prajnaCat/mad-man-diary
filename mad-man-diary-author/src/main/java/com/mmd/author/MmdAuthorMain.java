package com.mmd.author;

import com.alibaba.nacos.api.config.annotation.NacosProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author xch
 * @description
 * @date 2020-05-06
 */

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.mmd.author.feign")
public class MmdAuthorMain {
    public static void main(String[] args) {
        SpringApplication.run(MmdAuthorMain.class, args);
    }
}
