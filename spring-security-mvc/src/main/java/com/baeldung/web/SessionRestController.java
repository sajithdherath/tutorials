package com.baeldung.web;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionRestController {

    @GetMapping("/session-max-interval")
    @ResponseBody
    public String retrieveMaxSessionIncativeInterval(HttpSession session) {
        return "Max Inactive Interval before Session expires: " + session.getMaxInactiveInterval();
    }
}
