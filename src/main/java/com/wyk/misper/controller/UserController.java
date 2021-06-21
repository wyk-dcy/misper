package com.wyk.misper.controller;

import com.wyk.misper.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wuyongkang
 * @date 2021年06月11日 18:48
 */
@RestController
public class UserController {
    @Autowired
    private ProduceService produceService;

    @RequestMapping("/add")
    public String test() {
        String addCar = produceService.addCar();

        return addCar;

    }
}