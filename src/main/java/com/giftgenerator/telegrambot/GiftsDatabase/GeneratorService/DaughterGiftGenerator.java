package com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService;

import com.giftgenerator.telegrambot.GiftsDatabase.Gift;
import com.giftgenerator.telegrambot.GiftsDatabase.GiftsForWomans.DaughterGifts;

public class DaughterGiftGenerator implements GiftGenerator{
    @Override
    public Gift generateGiftList() {
        return new DaughterGifts();
    }
}
