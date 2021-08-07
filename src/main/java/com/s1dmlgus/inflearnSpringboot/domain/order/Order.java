package com.s1dmlgus.inflearnSpringboot.domain.order;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;
}
