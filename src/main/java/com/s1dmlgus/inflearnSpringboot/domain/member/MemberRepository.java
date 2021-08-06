package com.s1dmlgus.inflearnSpringboot.domain.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
