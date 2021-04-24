package com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService;

import com.giftgenerator.telegrambot.GiftsDatabase.Gift;
import com.giftgenerator.telegrambot.GiftsDatabase.GiftsForWomans.WifeGifts;

public class WifeGiftGenerator implements GiftGenerator{
    @Override
    public Gift generateGiftList() {
        return new WifeGifts();
    }
}
