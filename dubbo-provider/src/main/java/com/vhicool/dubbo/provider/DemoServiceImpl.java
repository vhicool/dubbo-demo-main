package com.vhicool.dubbo.provider;

import com.vhicool.dubbo.api.DemoService;
import com.vhicool.dubbo.model.BussinessException;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        if (1 == 1)
            throw new BussinessException("null");
        return name;
    }
}
