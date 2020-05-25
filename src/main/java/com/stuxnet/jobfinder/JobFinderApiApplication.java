package com.stuxnet.jobfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class JobFinderApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(JobFinderApiApplication.class, args);
	}

}
