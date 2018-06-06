package com.pravs.spring.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pravs.spring.grade.models.Logger;

@RestController
public class hellocontroller {

    private Logger logger;

    @Autowired
    public hellocontroller(Logger logger) {
        this.logger = logger;
    }

    @RequestMapping("hello")
    public String sayHello() {
        logger.info("Testing @Service and @Autowired for dependency injection via constructor");
        return "Hello!!!";
    }
}
