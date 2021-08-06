package com.s1dmlgus.inflearnSpringboot.service.member;

import com.s1dmlgus.inflearnSpringboot.domain.member.Grade;
import com.s1dmlgus.inflearnSpringboot.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    // 회원서비스 구현체
    MemberService memberService = new MemberServiceImpl();


    @Test
    public void joinTest() throws Exception{
        //given
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);

        //then
        assertThat(findMember).isEqualTo(memberA);
    }


}