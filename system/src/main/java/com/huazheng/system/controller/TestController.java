package com.huazheng.system.controller;

import com.huazheng.common.dao.TestMapper;
import com.huazheng.common.domain.Test;
import com.huazheng.common.domain.TestExample;
import com.huazheng.common.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/7/2 18:02
 * @Created by zhanghuazheng
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;
    @Resource
    private TestMapper testMapper;
    @GetMapping("/hello")
    public String testHello(){
        return "hello world";
    }

    @GetMapping("/test")
    public List<Test> findAll(){
        return testService.findAll();
    }

    @GetMapping("/findOne")
    public List<Test> findOne(){
        TestExample testExample = new TestExample();
        testExample.setOrderByClause("id desc");
        return testMapper.selectByExample(testExample);
    }


}
