package com.huazheng.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname EurekaMainApplication
 * @Description 服务注册中心启动类
 * @Date 2020/7/2 13:39
 * @Created by zhanghuazheng
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMainApplication {
    private static final Logger log = LoggerFactory.getLogger(EurekaMainApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication.class,args);
        log.info("SystemMainApplication 启动成功 ");
    }
}
