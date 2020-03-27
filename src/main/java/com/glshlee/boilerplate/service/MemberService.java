package com.glshlee.boilerplate.service;

import java.util.List;

import com.glshlee.boilerplate.entity.Member;
import com.glshlee.boilerplate.repository.MemberRepository;

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