package com.s1dmlgus.inflearnSpringboot.domain.order;

import com.s1dmlgus.inflearnSpringboot.domain.discount.DiscountPolicy;
import com.s1dmlgus.inflearnSpringboot.domain.discount.FixDiscountPolicy;
import com.s1dmlgus.inflearnSpringboot.domain.discount.RateDisountPolicy;
import com.s1dmlgus.inflearnSpringboot.domain.member.Member;
import com.s1dmlgus.inflearnSpringboot.domain.member.MemberRepository;
import com.s1dmlgus.inflearnSpringboot.domain.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 할인 정책 변경(정액 -> 정율)
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy discountPolicy = new RateDisountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discount = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discount);

    }
}
