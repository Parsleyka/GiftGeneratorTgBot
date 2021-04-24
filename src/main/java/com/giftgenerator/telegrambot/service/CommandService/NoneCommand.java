package com.giftgenerator.telegrambot.service.CommandService;

import org.springframework.stereotype.Service;

@Service
public class NoneCommand implements Command{
    @Override
    public String run() {
        return "Can't recognize command. Type /start and follow the instruction";
    }
}
