package com.giftgenerator.telegrambot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UsersConnect {

    private Map<Long,String> users = new HashMap<>();

    public void setRelationships(Long chatId, String relationships){

        users.put(chatId, relationships);
    }

    public String getRelationships(Long chatId){
        return users.get(chatId);
    }

    public void deleteUser(Long chatId){
        users.remove(chatId);
    }


}
