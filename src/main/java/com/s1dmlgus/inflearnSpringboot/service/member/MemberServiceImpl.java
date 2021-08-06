package com.s1dmlgus.inflearnSpringboot.service.member;

import com.s1dmlgus.inflearnSpringboot.domain.member.Member;
import com.s1dmlgus.inflearnSpringboot.domain.member.MemberRepository;
import com.s1dmlgus.inflearnSpringboot.domain.member.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository= new MemoryMemberRepository();


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
