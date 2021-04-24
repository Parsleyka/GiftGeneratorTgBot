package com.giftgenerator.telegrambot.service.CommandService;

import org.springframework.stereotype.Service;

@Service
public class StartCommand implements Command {
    @Override
    public String run() {
        return "Hi, I have been made for helping people to find perfect gift =)\n" +
                "If you want start configuration use (/generate)\n";
    }
}
