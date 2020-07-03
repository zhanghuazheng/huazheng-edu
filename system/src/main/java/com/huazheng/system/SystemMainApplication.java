package com.huazheng.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname SystemMainApplication
 * @Description 系统应用模块
 * @Date 2020/7/2 17:52
 * @Created by zhanghuazheng
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.huazheng.common.dao")
@ComponentScan("com.huazheng")
public class SystemMainApplication {
    private static final Logger log = LoggerFactory.getLogger(SystemMainApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SystemMainApplication.class,args);
        log.info("SystemMainApplication 启动成功 ");
    }
}
