package com.giftgenerator.telegrambot.service.CommandService;

import org.springframework.stereotype.Service;

@Service
public class ManCommand implements Command{

    @Override
    public String run() {
        return "Who is that person for you?\n" +
                " -Husband (/husband)\n" +
                " -Son (/son)\n";
    }
}
