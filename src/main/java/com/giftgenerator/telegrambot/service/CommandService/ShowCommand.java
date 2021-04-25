package com.giftgenerator.telegrambot.service.CommandService;

import com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService.GenerateGiftsByCriteria;
import com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService.GiftGenerator;
import com.giftgenerator.telegrambot.GiftsDatabase.Gift;
import com.giftgenerator.telegrambot.service.MessageService;
import com.giftgenerator.telegrambot.service.UsersConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowCommand implements Command{
    @Autowired
    UsersConnect userForGift;
    @Autowired
    MessageService messageService;

    GenerateGiftsByCriteria giftsByCriteria;
    GiftGenerator giftGenerator;
    Gift gift;

    private int num = 0;

    @Override
    public String run() {
        if(userForGift.getRelationships(messageService.getChatID()) != null) {
            giftsByCriteria = new GenerateGiftsByCriteria();
            giftGenerator = giftsByCriteria.generate(userForGift.getRelationships(messageService.getChatID()));
            gift = giftGenerator.generateGiftList();
            String answer = gift.showGifts(num);

            if (answer.equals("It is all for now.")) {
                return answer + "\n Use /exit to end.";
            } else return answer + "\n Use /next to see one more.";
        }
        else return "First of all use (/generate)";
    }

    public void setNum(int num){
        this.num = num;
    }
}
