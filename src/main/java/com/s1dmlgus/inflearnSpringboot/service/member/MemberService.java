package com.s1dmlgus.inflearnSpringboot.service.member;

import com.s1dmlgus.inflearnSpringboot.domain.member.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
