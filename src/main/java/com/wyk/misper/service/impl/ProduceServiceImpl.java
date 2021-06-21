package com.wyk.misper.service.impl;

import com.wisper.api.CarService;
import com.wyk.misper.service.ProduceService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author wuyongkang
 * @date 2021年06月20日 20:58
 */
@Service
public class ProduceServiceImpl implements ProduceService {
    @Reference
    private CarService carService;
    @Override
    public String addCar() {
        return carService.buyCar();
    }
}