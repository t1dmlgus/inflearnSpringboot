package com.s1dmlgus.inflearnSpringboot.domain.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
