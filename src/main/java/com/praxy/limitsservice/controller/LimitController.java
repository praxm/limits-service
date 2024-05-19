package com.praxy.limitsservice.controller;

import com.praxy.limitsservice.beans.Limits;
import com.praxy.limitsservice.config.Configurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configurations configurations;
    @GetMapping(path = "/limits")
    public Limits getLimit() {
        return new Limits(configurations.getMinimum(), configurations.getMaximum());
    }
}
