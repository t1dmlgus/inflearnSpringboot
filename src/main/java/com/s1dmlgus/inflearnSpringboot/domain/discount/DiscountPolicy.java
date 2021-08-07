package com.s1dmlgus.inflearnSpringboot.domain.discount;

import com.s1dmlgus.inflearnSpringboot.domain.member.Member;

public interface DiscountPolicy {

    /**
     *
     * @return 할인 금액
     */
    int discount(Member member, int price);
}
