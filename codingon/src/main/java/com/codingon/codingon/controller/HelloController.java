package com.codingon.codingon.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    @ResponseBody
    public String Hello() {
        return "hi";
    }

    @Autowired
    private HttpSession session;
    @GetMapping("/session1")
    public String setSession1() {
        session.setAttribute("name1", "session1");
        Object s1 = session.getAttribute("name1");
        System.out.println(s1.toString());
        return "session1";
    }
    @GetMapping("/session2")
    public String setSession2(HttpSession session) {
        session.setAttribute("name2", "session2");
        Object s1 = session.getAttribute("name2");
        System.out.println(s1.toString());
        // session.invalidate(); // 세션 삭제 ( 로그아웃 )
        return "session2";
    }
    @GetMapping("/session3")
    public String setSession3(HttpServletRequest req) {
        HttpSession session = req.getSession();
        session.setAttribute("name3", "session3");
        Object s1 = session.getAttribute("name3");
        System.out.println(s1.toString());
        return "session3";
    }

}
