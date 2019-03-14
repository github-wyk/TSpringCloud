package com.service.consumer.ribbon.serviceImpl;

import com.service.consumer.ribbon.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RibbonServiceImpl implements ExampleService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hello(String name) {
        return restTemplate.getForObject("http://service-producer/hello?name="+name,String.class);
    }
}