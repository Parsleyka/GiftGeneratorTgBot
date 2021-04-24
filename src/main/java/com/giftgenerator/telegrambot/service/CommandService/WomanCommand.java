package com.giftgenerator.telegrambot.service.CommandService;

import org.springframework.stereotype.Service;

@Service
public class WomanCommand implements Command{

    @Override
    public String run() {
        return "Who is that person for you?\n" +
                " -Wife (/wife)\n" +
                " -Daughter (/daughter)\n";
    }
}
