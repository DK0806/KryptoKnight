package com.dhruv.request;

import com.dhruv.domain.OrderType;

import com.dhruv.model.Coin;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
