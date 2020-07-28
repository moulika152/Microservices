package com.acs.springcloud.course.controller;

import com.acs.springcloud.course.model.Course;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {;

	/**
	 * expose the end-point to retrieve the courses
	 * @return
	 */
	@GetMapping("/courses")
	@ResponseStatus(code = HttpStatus.OK)
	List<Course> getCourses(){

		Course course1 = new Course("1", "Introduction to Micro services");
		Course course2 = new Course("2", "Introduction to Zuul API Gateway");
		Course course3 = new Course("3", "Introduction to Ribbon Load Balancer");

		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);

		return courses;
	}

}
