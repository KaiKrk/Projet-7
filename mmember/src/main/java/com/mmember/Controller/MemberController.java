package com.mmember.Controller;

import com.mmember.Entity.Member;
import com.mmember.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
public class MemberController {


    @Autowired
    private MemberService memberService;

    @PostMapping("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    public String showFormForAdd(@RequestBody Member member) {
        memberService.save(member);
        return "member";
    }

    @GetMapping("/list")
    public String listContact() {
        List<Member> Members = memberService.findAll();
        return "Members";
    }
}
