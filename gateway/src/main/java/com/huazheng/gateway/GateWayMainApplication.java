package com.huazheng.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname GateWayMainApplication
 * @Description 增加网关模块
 * @Date 2020/7/2 19:16
 * @Created by zhanghuazheng
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMainApplication {
    private static final Logger log = LoggerFactory.getLogger(GateWayMainApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GateWayMainApplication.class,args);
        log.info("GateWayMainApplication 启动成功 ");
    }
}
