package com.service.consumer.hystrix;

import com.service.consumer.service.FeignExampleService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


@Component
public class FeignServiceHystrix implements FeignExampleService {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "sorry "+name+"，service has fail!";
    }
}