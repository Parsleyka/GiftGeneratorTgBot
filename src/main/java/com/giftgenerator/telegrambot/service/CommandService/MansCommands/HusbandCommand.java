package com.giftgenerator.telegrambot.service.CommandService.MansCommands;

import com.giftgenerator.telegrambot.service.CommandService.Command;
import com.giftgenerator.telegrambot.service.MessageService;
import com.giftgenerator.telegrambot.service.UsersConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HusbandCommand implements Command {
    @Autowired
    UsersConnect userForGift;
    @Autowired
    MessageService messageService;

    @Override
    public String run() {
        userForGift.setRelationships(messageService.getChatID(), "husband");
        return "Nice! Almost done, just use (/show).";
    }
}
