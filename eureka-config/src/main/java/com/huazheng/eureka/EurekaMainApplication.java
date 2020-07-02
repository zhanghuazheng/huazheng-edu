package com.huazheng.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname EurekaMainApplication
 * @Description 服务注册中心启动类
 * @Date 2020/7/2 13:39
 * @Created by zhanghuazheng
 */
@SpringBootConfiguration
@EnableEurekaServer
public class EurekaMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication.class,args);
    }
}
