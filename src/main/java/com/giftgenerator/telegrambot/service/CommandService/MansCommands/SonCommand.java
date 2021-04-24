package com.giftgenerator.telegrambot.service.CommandService.MansCommands;

import com.giftgenerator.telegrambot.service.CommandService.Command;
import com.giftgenerator.telegrambot.service.UserForGift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SonCommand implements Command {
    @Autowired
    UserForGift userForGift;

    @Override
    public String run() {
        userForGift.setRelationships("son");
        return "Nice! Almost done, just use (/show).";
    }
}

