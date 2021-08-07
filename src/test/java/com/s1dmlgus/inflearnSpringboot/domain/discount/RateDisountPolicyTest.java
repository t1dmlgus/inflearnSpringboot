package com.s1dmlgus.inflearnSpringboot.domain.discount;

import com.s1dmlgus.inflearnSpringboot.domain.member.Grade;
import com.s1dmlgus.inflearnSpringboot.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDisountPolicyTest {

    RateDisountPolicy disountPolicy = new RateDisountPolicy();

    @Test
    public void vip_o() throws Exception{
        //given
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);

        //when
        int discount = disountPolicy.discount(memberVIP, 10000);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

}