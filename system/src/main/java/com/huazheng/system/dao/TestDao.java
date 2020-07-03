package com.huazheng.system.dao;

import com.huazheng.system.domain.Test;

import java.util.List;

/**
 * @Classname TestDap
 * @Description TODO
 * @Date 2020/7/3 15:03
 * @Created by zhanghuazheng
 */
public interface TestDao {
    List<Test> findAll();
}
