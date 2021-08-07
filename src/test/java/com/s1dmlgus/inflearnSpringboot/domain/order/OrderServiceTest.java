package com.s1dmlgus.inflearnSpringboot.domain.order;

import com.s1dmlgus.inflearnSpringboot.AppConfig;
import com.s1dmlgus.inflearnSpringboot.domain.member.Grade;
import com.s1dmlgus.inflearnSpringboot.domain.member.Member;
import com.s1dmlgus.inflearnSpringboot.service.member.MemberService;
import com.s1dmlgus.inflearnSpringboot.service.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;


    @BeforeEach
    void setUp() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    // 주문 테스트
    @Test
    public void createOrderTest() throws Exception{
        //given
        long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        //when
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        //then
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}