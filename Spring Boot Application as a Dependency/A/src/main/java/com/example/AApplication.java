package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.b.Test;

@SpringBootApplication
public class AApplication {
	public static void main(String[] args) {
		SpringApplication.run(AApplication.class, args);
		Test t = new Test();
		System.out.println("result :  "+t.test());
	}
}