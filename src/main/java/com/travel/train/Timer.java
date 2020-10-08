package com.travel.train;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Timer {

	private static final Logger logger = LoggerFactory.getLogger(Timer.class);

	public void demoLog() throws InterruptedException {
		while (true) {
			logger.info("Inside scheduleTask - Sending logs to Kafka at "
					+ DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
			logger.info("Info log line-1 - in the controller ");
			logger.info("Info log line-2 - in the service and external GE API call successful");
			logger.info("Info log line-3 - in the repository");
			//Thread.sleep(3000);
		}
	}

}
