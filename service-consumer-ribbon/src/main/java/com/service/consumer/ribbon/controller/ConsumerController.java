package com.service.consumer.ribbon.controller;

import com.service.consumer.ribbon.serviceImpl.RibbonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    RibbonServiceImpl ribbonServiceImpl;

    @Value("${spring.application.name}")
    String applicationName;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return ribbonServiceImpl.hello(name+", from "+applicationName);
    }

}