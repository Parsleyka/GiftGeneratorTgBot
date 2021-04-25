package com.giftgenerator.telegrambot.service.CommandService.WomansCommands;

import com.giftgenerator.telegrambot.service.CommandService.Command;
import com.giftgenerator.telegrambot.service.MessageService;
import com.giftgenerator.telegrambot.service.UsersConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaughterCommand implements Command {
    @Autowired
    UsersConnect userForGift;
    @Autowired
    MessageService messageService;

    @Override
    public String run() {
        userForGift.setRelationships(messageService.getChatID(), "daughter");
        return "Nice! Almost done, just use (/show).";
    }
}
