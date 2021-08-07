package com.s1dmlgus.inflearnSpringboot.domain.discount;

import com.s1dmlgus.inflearnSpringboot.domain.member.Grade;
import com.s1dmlgus.inflearnSpringboot.domain.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private final int DISCOUNT_AMOUNT = 1000;


    @Override
    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP) {
            return DISCOUNT_AMOUNT;

        }else {
            return 0;
        }
    }


}
