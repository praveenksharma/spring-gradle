package com.pravs.spring.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pravs.spring.grade.models.soundsystem.guru;

@RestController
public class Webradio {
	
	@Autowired
	private guru cdOfGuru;
	
	 @RequestMapping("/wr/play")
	    public String play() {
		 return cdOfGuru.play();
	    }
}