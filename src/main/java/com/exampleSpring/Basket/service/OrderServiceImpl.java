package com.exampleSpring.Basket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class OrderServiceImpl implements OrderService{

    List<Integer> order = new ArrayList<>();

    public OrderServiceImpl(List<Integer> order) {
        this.order = order;
    }

    @Override
    public List<Integer> add(List<Integer> list) {
        order.addAll(list);
        return list;
    }

    @Override
    public List<Integer> get() {
        return order;
    }
}
