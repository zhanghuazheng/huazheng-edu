package com.huazheng.system.service;

import com.huazheng.system.dao.TestDao;
import com.huazheng.system.domain.Test;
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
    private TestDao testDao;

    public List<Test> findAll(){
        return testDao.findAll();
    }

}
