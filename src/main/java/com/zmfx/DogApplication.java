package com.zmfx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	//用来声明这是启动SpringBoot程序的启动类，必须有
public class DogApplication {
	public static void main(String[] args) {
		SpringApplication.run(DogApplication.class, args);
	}
}
