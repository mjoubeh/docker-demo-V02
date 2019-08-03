package com.example.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDockerApplication {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Line 1");
		SpringApplication.run(DemoDockerApplication.class, args);

		System.out.println("line 2");
		Thread.sleep(1000 * 60);
		System.out.println("line 3 agter 1 min of sleeping");
	}
}
