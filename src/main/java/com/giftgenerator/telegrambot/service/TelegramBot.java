package com.giftgenerator.telegrambot.service;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.giftgenerator.telegrambot.service.CommandService.MainCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@PropertySource("application.properties")
public class TelegramBot extends TelegramLongPollingBot{

    @Value("${bot.username}")
    private String botUsername;
    @Value("${bot.token}")
    private String botToken;


    @Autowired
    MainCommandService mainCommandService;

    @Override
    public void onUpdateReceived(Update update) {
        mainCommandService.dispatch(update);
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
