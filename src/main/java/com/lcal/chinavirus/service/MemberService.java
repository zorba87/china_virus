package com.lcal.chinavirus.service;

import java.util.List;

import com.lcal.chinavirus.entity.Member;
import com.lcal.chinavirus.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }
}