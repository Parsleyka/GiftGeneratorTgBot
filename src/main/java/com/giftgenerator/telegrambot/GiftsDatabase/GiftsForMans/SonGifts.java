package com.giftgenerator.telegrambot.GiftsDatabase.GiftsForMans;

import com.giftgenerator.telegrambot.GiftsDatabase.Gift;

import java.util.ArrayList;
import java.util.List;

public class SonGifts implements Gift {

    List<String> sonGifts = new ArrayList<>();

    public void SonArray() {
        sonGifts.add("https://rozetka.com.ua/orbea_k10153gb/p128414326/");
        sonGifts.add("https://rozetka.com.ua/xiaomi_jyu4202cn/p199631527/");
        sonGifts.add("https://rozetka.com.ua/285591938/p285591938/");
    }

    @Override
    public String showGifts(int num) {
        SonArray();
        if(num < sonGifts.size()) {
            return sonGifts.get(num);
        }else
            return "It is all for now.";
    }
}
