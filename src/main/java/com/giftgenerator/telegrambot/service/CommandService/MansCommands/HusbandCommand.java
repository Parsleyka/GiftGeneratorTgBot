package com.giftgenerator.telegrambot.service.CommandService.MansCommands;

import com.giftgenerator.telegrambot.service.CommandService.Command;
import com.giftgenerator.telegrambot.service.UserForGift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HusbandCommand implements Command {
    @Autowired
    UserForGift userForGift;

    @Override
    public String run() {
        userForGift.setRelationships("husband");
        return "Nice! Almost done, just use (/show).";
    }
}
