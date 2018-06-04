package com.pravs.spring.grade;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pravs.spring.grade.models.user;

@RestController
public class usercontroller {
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("user")
    public user user(@RequestParam(value = "name", defaultValue = "User1") String name) {
//        return "Hello User " + name;
        return new user(counter.incrementAndGet(), name, "Last Name");
    }
}
