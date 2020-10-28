package com.lksun.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lksun.service2.dao.OrdersDao;
import com.lksun.service2.entity.Orders;

@RestController
public class Controller {

    @Autowired
    OrdersDao ordersDao;

    @GetMapping("/rm")
    @Transactional
    public void rm(){
        Orders order = new Orders();
        order.setStatus(true);
        Integer i = 1/1;
        ordersDao.insert(order);
    }
}
