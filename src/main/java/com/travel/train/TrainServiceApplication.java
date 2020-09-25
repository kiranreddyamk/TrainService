package com.travel.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainServiceApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(TrainServiceApplication.class, args);
		Timer timer = new Timer();
		timer.log();
	}

}
