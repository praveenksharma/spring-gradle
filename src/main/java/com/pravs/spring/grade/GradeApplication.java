package com.pravs.spring.grade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.pravs.spring.grade.models.user;
import org.joda.time.LocalTime;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;


@SpringBootApplication
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.pravs.spring.grade.models.soundsystem.*")})
public class GradeApplication {

	public static void main(String[] args) {
		user User = new user(1, "Bill", "Gates");
		System.out.println("User's id is: " + User.getId() + " First and last name is: " + User.getFirstName() + " " + User.getLastName());

		System.out.println("User's full name is " + User.getFullName());

		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		SpringApplication.run(GradeApplication.class, args);
	}
}
