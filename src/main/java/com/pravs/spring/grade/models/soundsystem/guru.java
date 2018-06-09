package com.pravs.spring.grade.models.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class guru implements CompactDisc {
	
	private String title = "Guru - The Vision";
	private String artist = "Abhishek Bacchan, Aishwarya Rai";

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Playing title: " + title + " and the artists are: " + artist;
	}

}
