package com.giftgenerator.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class GiftgeneratorTgBotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(GiftgeneratorTgBotApplication.class, args);
	}

}
