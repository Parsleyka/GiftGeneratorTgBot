package com.giftgenerator.telegrambot.GiftsDatabase.GiftsForWomans;

import com.giftgenerator.telegrambot.GiftsDatabase.Gift;

import java.util.ArrayList;
import java.util.List;

public class WifeGifts implements Gift {

    List<String> wifeGifts = new ArrayList<>();

    public void WifeArray() {
        wifeGifts.add("https://rozetka.com.ua/281307438/p281307438/");
        wifeGifts.add("https://rozetka.com.ua/apple_mhdf3/p260910196/");
        wifeGifts.add("https://rozetka.com.ua/maybelline_3600531145941/p4574469/");
    }

    @Override
    public String showGifts(int num) {
        WifeArray();
        if(num < wifeGifts.size()) {
            return wifeGifts.get(num);
        }else
            return "It is all for now.";
    }
}
