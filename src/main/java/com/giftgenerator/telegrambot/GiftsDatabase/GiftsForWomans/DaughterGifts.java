package com.giftgenerator.telegrambot.GiftsDatabase.GiftsForWomans;

import com.giftgenerator.telegrambot.GiftsDatabase.Gift;

import java.util.ArrayList;
import java.util.List;

public class DaughterGifts implements Gift {

    List<String> daughterGifts = new ArrayList<>();

    public void DaughterArray() {
        daughterGifts.add("https://rozetka.com.ua/la_roche_posay_5902503497675/p283282183/");
        daughterGifts.add("https://rozetka.com.ua/hp_2y3a4ea/p282029273/");
        daughterGifts.add("https://rozetka.com.ua/greengy_4820221320420/p148998754/");
    }

    @Override
    public String showGifts(int num) {
        DaughterArray();
        if(num < daughterGifts.size()) {
            return daughterGifts.get(num);
        }else
            return "It is all for now.";
    }
}
