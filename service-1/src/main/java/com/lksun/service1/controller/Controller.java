package com.lksun.service1.controller;

import com.lksun.service1.dao.OrderDao;
import com.lksun.service1.entity.Order;
import org.aspectj.weaver.ast.Or;
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
        try{
            Order order = new Order();
            order.setStatus(1);
            orderDao.insert(order);

            rm2();
            return "Success";
        }catch (Exception e){
            return "Fail";
        }

    }

    @Autowired
    private RestTemplate restTemplate;

    public void rm2(){
        restTemplate.getForEntity("http://service2/rm",String.class).getBody();
    }
}
