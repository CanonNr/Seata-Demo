package com.lksun.service1.controller;

import com.lksun.service1.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @Autowired
    OrderDao orderDao;

    @RequestMapping("/rm")
    public String action(){
        return rm2();
    }

    @Autowired
    private RestTemplate restTemplate;

    public String rm2(){
        return restTemplate.getForEntity("http://service2/rm",String.class).getBody();
    }
}
