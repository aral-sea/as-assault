package com.as.order.controller;

import com.as.order.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Order order) {
        log.info("创建订单开始...");
        // 调用订单服务

        // 调用库存服务

        // 调用仓储服务

        // 调用积分服务
        log.info("创建订单结束");
        return "success";
    }
}
