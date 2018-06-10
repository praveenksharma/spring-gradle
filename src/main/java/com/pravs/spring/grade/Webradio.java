package com.pravs.spring.grade;

import com.pravs.spring.grade.models.soundsystem.CDPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webradio {
//
//	@Autowired
//	private guru cdOfGuru;

    @Autowired
    private CDPlayer cdPlayer;

    public Webradio(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }


    @RequestMapping("/wr/play")
	    public String play() {
	 	return cdPlayer.play();
	    }
}