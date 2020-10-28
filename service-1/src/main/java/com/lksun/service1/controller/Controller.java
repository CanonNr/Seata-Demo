package com.lksun.service1.controller;

import com.lksun.service1.dao.OrderDao;
import com.lksun.service1.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    OrderDao orderDao;

    @RequestMapping("/add")
    public Order add(){
        return orderDao.selectByPrimaryKey(1);
    }
}
