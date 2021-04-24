package com.giftgenerator.telegrambot.service.CommandService;

import com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService.GenerateGiftsByCriteria;
import com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService.GiftGenerator;
import com.giftgenerator.telegrambot.GiftsDatabase.Gift;
import com.giftgenerator.telegrambot.service.UserForGift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowCommand implements Command{
    @Autowired
    UserForGift userForGift;
    GenerateGiftsByCriteria giftsByCriteria;
    GiftGenerator giftGenerator;
    Gift gift;

    private int num = 0;

    public ShowCommand(UserForGift userForGift){
        this.userForGift = userForGift;
    }

    @Override
    public String run() {
        giftsByCriteria = new GenerateGiftsByCriteria();
        giftGenerator = giftsByCriteria.generate(userForGift.getRelationships());
        gift = giftGenerator.generateGiftList();
        String answer = gift.showGifts(num);
        if(answer.equals("It is all for now.")) {
            return answer + "\n Use /generate to see gifts for someone else.";
        }else return answer + "\n Use /next to see one more.";
    }

    public void setNum(int num){
        this.num = num;
    }
}
