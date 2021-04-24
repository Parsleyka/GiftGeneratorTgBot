package com.giftgenerator.telegrambot.service.CommandService;

import com.giftgenerator.telegrambot.service.UserForGift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExitCommand implements Command{
    @Autowired
    UserForGift userForGift;

    @Override
    public String run() {
        userForGift.setGender(null);
        userForGift.setRelationships(null);

        return "Thank you for using me =)\n" +
                "If you want generate one more gift restart me (/start)\n";
    }
}
