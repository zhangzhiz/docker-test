package com.example.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@org.springframework.web.bind.annotation.RestController
public class DockerSpringBootApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World."
				+ "<br />Welcome to <a href='http://www.baidu.com'>waylau.com</a></li>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}
}
