package com.s1dmlgus.inflearnSpringboot.service.member;

import com.s1dmlgus.inflearnSpringboot.AppConfig;
import com.s1dmlgus.inflearnSpringboot.domain.member.Grade;
import com.s1dmlgus.inflearnSpringboot.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    void setUp() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    public void joinTest() throws Exception {
        //given
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);

        //then
        assertThat(findMember).isEqualTo(memberA);
    }


}