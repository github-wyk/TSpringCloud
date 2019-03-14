package com.service.consumer.controller;

import com.service.consumer.service.FeignExampleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ConsumerController {

    @Value("${spring.application.name}")
    String applicationName;

    @Resource
    private FeignExampleService feignExampleService;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return feignExampleService.hello(name+", from "+applicationName);
    }
}