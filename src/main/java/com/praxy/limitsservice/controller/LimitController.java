package com.praxy.limitsservice.controller;

import com.praxy.limitsservice.beans.Limits;
import org.springframework.web.bind.annotation.GetMapping;

public class LimitController {
    @GetMapping(path = "/limits")
    public Limits getLimit() {

    }
}
