package com.giftgenerator.telegrambot.service.CommandService;

import com.giftgenerator.telegrambot.service.UserForGift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WomanCommand implements Command{
    @Autowired
    UserForGift userForGift;

    @Override
    public String run() {
        userForGift.setGender('W');
        return "Who is that person for you?\n" +
                " -Wife (/wife)\n" +
                " -Daughter (/daughter)\n";
    }
}
