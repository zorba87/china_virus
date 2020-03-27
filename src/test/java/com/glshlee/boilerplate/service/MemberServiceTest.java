package com.glshlee.boilerplate.service;


import com.glshlee.boilerplate.entity.Member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void testGetAllMember() {
        for (Member member : memberService.getAllMember()) {
            log.info(member.toString());
        }
    }
}