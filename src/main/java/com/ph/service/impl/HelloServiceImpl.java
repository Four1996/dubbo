package com.ph.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ph.service.HelloService;

/**
 * @program: dubbo_demo
 * @description:
 * @author: panhao
 * @date: 2021-06-24 20:09
 **/
@Service //发布服务必须使用Dubbo提供的Service
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "hello" + name;
    }
}
