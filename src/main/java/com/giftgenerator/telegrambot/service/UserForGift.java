package com.giftgenerator.telegrambot.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class UserForGift {
    private char gender;
    private String relationships;

    public void setGender(Character gender){
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }

    public void setRelationships(String relationships){
        this.relationships = relationships;
    }

    public String getRelationships(){
        return relationships;
    }


}
