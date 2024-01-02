package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> { // <제네릭, pk 자료형의 래퍼클래스>

}
