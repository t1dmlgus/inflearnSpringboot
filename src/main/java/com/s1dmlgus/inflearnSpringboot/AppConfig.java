package com.s1dmlgus.inflearnSpringboot;

import com.s1dmlgus.inflearnSpringboot.domain.discount.DiscountPolicy;
import com.s1dmlgus.inflearnSpringboot.domain.discount.FixDiscountPolicy;
import com.s1dmlgus.inflearnSpringboot.domain.member.MemoryMemberRepository;
import com.s1dmlgus.inflearnSpringboot.domain.order.OrderService;
import com.s1dmlgus.inflearnSpringboot.domain.order.OrderServiceImpl;
import com.s1dmlgus.inflearnSpringboot.service.member.MemberService;
import com.s1dmlgus.inflearnSpringboot.service.member.MemberServiceImpl;

// 애플리케이션의 전체 동작 방식을 구성(config)
// 구현 객체를 생성하고, 연결하는 책임을 가지는 별도의 설정 클래스
public class AppConfig {


    // memeberService 역할
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    // memeberRepository 역할
    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // orderService 역할
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    // 할인 정책 역할
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }




}
