package com.giftgenerator.telegrambot.service.CommandService;

import com.giftgenerator.telegrambot.service.UserForGift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManCommand implements Command{
    @Autowired
    UserForGift userForGift;

    @Override
    public String run() {
        userForGift.setGender('M');
        return "Who is that person for you?\n" +
                " -Husband (/husband)\n" +
                " -Son (/son)\n";
    }
}
