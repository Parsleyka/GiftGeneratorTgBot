package com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService;

import com.giftgenerator.telegrambot.GiftsDatabase.Gift;
import com.giftgenerator.telegrambot.GiftsDatabase.GiftsForMans.SonGifts;

public class SonGiftGenerator implements GiftGenerator{
    @Override
    public Gift generateGiftList() {
        return new SonGifts();
    }
}
