package com.pravs.spring.grade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MVC_Test {
    @RequestMapping("mtest")
    @ResponseBody
    public String hi() {
        return "Hi";
    }
}
