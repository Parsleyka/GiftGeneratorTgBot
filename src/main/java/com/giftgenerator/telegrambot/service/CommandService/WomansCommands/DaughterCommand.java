package com.giftgenerator.telegrambot.service.CommandService.WomansCommands;

import com.giftgenerator.telegrambot.service.CommandService.Command;
import com.giftgenerator.telegrambot.service.UsersConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaughterCommand implements Command {
    @Autowired
    UsersConnect userForGift;

    @Override
    public String run() {
        userForGift.setRelationships("daughter");
        return "Nice! Almost done, just use (/show).";
    }
}
