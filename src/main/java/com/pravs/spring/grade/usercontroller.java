package com.pravs.spring.grade;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {
    @RequestMapping("user")
    public String user() {
        return "Welcome to user controller!!!";
    }
}
