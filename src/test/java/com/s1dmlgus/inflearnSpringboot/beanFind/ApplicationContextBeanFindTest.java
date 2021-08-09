package com.s1dmlgus.inflearnSpringboot.beanFind;

import com.s1dmlgus.inflearnSpringboot.AppConfig;
import com.s1dmlgus.inflearnSpringboot.service.member.MemberService;
import com.s1dmlgus.inflearnSpringboot.service.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationContextBeanFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);


    @DisplayName("빈 이름으로 조회")
    @Test
    public void findBeanByNameTest() throws Exception{
        //given
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        System.out.println("memberService = " + memberService);
        System.out.println("memberService.getClass = " + memberService.getClass());

        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @DisplayName("이름 없이 타입으로만 조회")
    @Test
    public void findBeanByTypeTest() throws Exception{
        //given
        MemberService memberService = ac.getBean(MemberService.class);
        System.out.println("memberService = " + memberService);
        System.out.println("memberService.getClass = " + memberService.getClass());

        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @DisplayName("구체 타입으로 조회")
    @Test
    public void findBeanByType2Test() throws Exception{
        //given
        MemberServiceImpl memberService = ac.getBean(MemberServiceImpl.class);

        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @DisplayName("[실패 테스트]빈 이름으로 조회 x")
    @Test
    public void findByBeanByNameX() throws Exception{
        //given
        //assertThat(ac.getBean("xxxx", MemberService.class)).isInstanceOf(MemberService.class);
        //when


        assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean("xxxx", MemberService.class));

        //then
    }


}
