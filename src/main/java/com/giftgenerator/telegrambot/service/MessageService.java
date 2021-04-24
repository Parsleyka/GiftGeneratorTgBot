package com.giftgenerator.telegrambot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

//@Scope("prototype")
@Service
public class MessageService {
    private long chatID;

    @Autowired
    TelegramBot telegramBot;

    public void sendMessage(Message message,String text){
        SendMessage sendMessage = new SendMessage();
        chatID = message.getChatId();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            telegramBot.execute(sendMessage);
        }
        catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    public long getChatID() {
        return chatID;
    }
}

