package com.giftgenerator.telegrambot.service.CommandService;

import com.giftgenerator.telegrambot.service.MessageService;
import com.giftgenerator.telegrambot.service.UsersConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExitCommand implements Command{
    @Autowired
    UsersConnect userForGift;
    @Autowired
    MessageService messageService;


    @Override
    public String run() {
        userForGift.deleteUser(messageService.getChatID());

        return "Thank you for using me =)\n" +
                "If you want generate one more gift use (/generate)\n";
    }
}
