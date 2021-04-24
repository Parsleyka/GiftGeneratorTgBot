package com.giftgenerator.telegrambot.GiftsDatabase.GiftsForMans;

import com.giftgenerator.telegrambot.GiftsDatabase.Gift;

import java.util.ArrayList;
import java.util.List;

public class HusbandGifts implements Gift {

    List<String> husbandGifts = new ArrayList<>();

    public void HusbandArray() {
        husbandGifts.add("https://rozetka.com.ua/versace_img395/p11285236/");
        husbandGifts.add("https://rozetka.com.ua/orbea_l12257b8/p249474026/");
        husbandGifts.add("https://rozetka.com.ua/lucky_john_ljcx_902mf/p240273409/");
    }

    @Override
    public String showGifts(int num) {
        HusbandArray();
        if(num < husbandGifts.size()) {
            return husbandGifts.get(num);
        }else
            return "It is all for now.";
    }
}
