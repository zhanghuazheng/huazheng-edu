package com.huazheng.common.service;

import com.huazheng.common.dao.TestMapper;
import com.huazheng.common.domain.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname TestService
 * @Description TODO
 * @Date 2020/7/3 15:04
 * @Created by zhanghuazheng
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> findAll(){
        return testMapper.selectByExample(null);
    }

}
