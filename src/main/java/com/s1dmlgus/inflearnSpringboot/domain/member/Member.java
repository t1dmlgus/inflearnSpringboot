package com.s1dmlgus.inflearnSpringboot.domain.member;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {

    private Long id;
    private String name;
    private Grade grade;


}
