package com.pravs.spring.grade.models.soundsystem;

import org.springframework.stereotype.Component;

@Component("GuruDVD")
public class guru implements CompactDisc {
	
	private String title = "Guru - The Vision!";
	private String artist = "Abhishek Bacchan, Aishwarya Rai";

	@Override
	public String play() {
		return "Playing title: " + title + " and the artists are: " + artist;
	}

}
