package com.s1dmlgus.inflearnSpringboot.domain.discount;

import com.s1dmlgus.inflearnSpringboot.domain.member.Grade;
import com.s1dmlgus.inflearnSpringboot.domain.member.Member;

public class RateDisountPolicy implements DiscountPolicy{

    private int discountPolicy = 10;    // 10% 할인


    @Override
    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP) {

            return price * discountPolicy / 100;
        }else {
            return 0;
        }
        
    }
}
