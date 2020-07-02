package com.huazheng.system;

import org.bouncycastle.math.ec.ScaleYPointMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname SystemMainApplication
 * @Description TODO
 * @Date 2020/7/2 17:52
 * @Created by zhanghuazheng
 */
@SpringBootApplication
public class SystemMainApplication {
    private static final Logger log = LoggerFactory.getLogger(SystemMainApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SystemMainApplication.class,args);
        log.info("SystemMainApplication 启动成功 ");
    }
}
