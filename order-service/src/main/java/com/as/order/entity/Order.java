package com.as.order.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private Long productId;

    private Long userId;

    private Long count;

    private BigDecimal totalPrice;
}
