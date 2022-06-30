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
    public void rm(Integer id) throws InterruptedException {
        Thread.sleep(5000);
        Orders order = new Orders();
        order.setId(1);
        order.setStatus(100);
        Integer i = 1/id;
        ordersDao.updateByPrimaryKey(order);
    }
}
