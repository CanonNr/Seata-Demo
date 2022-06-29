package com.lksun.service1.controller;

import com.lksun.service1.dao.OrderDao;
import com.lksun.service1.entity.Order;
import io.seata.spring.annotation.GlobalTransactional;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @Autowired
    OrderDao orderDao;

    @RequestMapping("/rm")
    @GlobalTransactional(rollbackFor = Exception.class)
    public String action(Integer id) {
        Order order = orderDao.selectByPrimaryKey(1);
        order.setStatus(order.getStatus()+100);
        // orderDao.insert(order);
        orderDao.updateByPrimaryKey(order);
        rm2(id);
        int i = 10 / id;
        return "Success";


    }

    @Autowired
    private RestTemplate restTemplate;

    public void rm2(Integer id) {
        restTemplate.getForEntity("http://service2/rm?id="+id, String.class).getBody();
    }
}
