package com.test.springlecture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


/**
 *
 */
@SpringBootApplication
public class SpringLectureApplication {

	private Logger logger = LoggerFactory.getLogger(SpringLectureApplication.class);

	public static void main(String[] args) {
		System.out.println(SpringLectureApplication.class.getClassLoader());
		SpringApplication.run(SpringLectureApplication.class, args);

//		SpringApplication springApplication = new SpringApplication(SpringLectureApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF);
//		springApplication.run(args);
	}


	@PostConstruct
	public void myLog() {
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
}
