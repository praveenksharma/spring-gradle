package com.pravs.spring.grade.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.pravs.spring.grade.models.soundsystem.*;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:beans.xml"})
public class CDPlayerConfig {
//    @Bean
//    public guru guru() {
//        return new guru();
//    }
//
//    @Bean
//    public CDPlayer cdPlayer() {
//        return new CDPlayer(guru());
//    }
}
