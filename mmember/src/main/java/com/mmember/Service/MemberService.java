package com.mmember.Service;

import com.mmember.Entity.Member;
import com.mmember.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void save(Member theMember) {
        memberRepository.save(theMember);
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
