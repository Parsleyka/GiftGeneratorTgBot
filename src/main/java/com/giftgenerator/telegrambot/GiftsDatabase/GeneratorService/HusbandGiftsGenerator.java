package com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService;

import com.giftgenerator.telegrambot.GiftsDatabase.Gift;
import com.giftgenerator.telegrambot.GiftsDatabase.GiftsForMans.HusbandGifts;

public class HusbandGiftsGenerator implements GiftGenerator{
    @Override
    public Gift generateGiftList() {
        return new HusbandGifts();
    }
}
