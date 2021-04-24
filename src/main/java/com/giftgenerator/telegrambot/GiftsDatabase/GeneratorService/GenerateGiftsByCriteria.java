package com.giftgenerator.telegrambot.GiftsDatabase.GeneratorService;

public class GenerateGiftsByCriteria {

    public GiftGenerator generate(String relationships){
        if (relationships.equalsIgnoreCase("husband"))
            return new HusbandGiftsGenerator();
        if (relationships.equalsIgnoreCase("son"))
            return new SonGiftGenerator();

        if (relationships.equalsIgnoreCase("wife"))
            return new WifeGiftGenerator();
        if (relationships.equalsIgnoreCase("daughter"))
            return new DaughterGiftGenerator();

        return null;
    }
}
