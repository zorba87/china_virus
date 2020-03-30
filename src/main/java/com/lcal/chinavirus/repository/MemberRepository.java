package com.lcal.chinavirus.repository;

import com.lcal.chinavirus.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    
}