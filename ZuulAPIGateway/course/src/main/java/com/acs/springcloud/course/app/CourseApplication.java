package com.acs.springcloud.course.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.acs.springcloud.course")
public class CourseApplication {
	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}
}
