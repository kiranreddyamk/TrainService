package com.travel.train;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Timer {

	private static final Logger logger = LoggerFactory.getLogger(Timer.class);

	public void log() throws InterruptedException {
		while (true) {
			logger.info("Inside scheduleTask - Sending logs to Kafka at "
					+ DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
			Thread.sleep(3000);
		}
	}

}
