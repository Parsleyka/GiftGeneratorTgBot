package com.giftgenerator.telegrambot.service.CommandService;

public enum BotCommands {
    START("/start"),
    GENERATE("/generate"),
    SHOW("/show"),
    EXIT("/exit"),
    NONE("/none"),
    NEXT("/next"),

    MAN("/man"),
    HUSBAND("/husband"),
    SON("/son"),

    WOMAN("/woman"),
    WIFE("/wife"),
    DAUGHTER("/daughter");

    String command;

    BotCommands(String command){
        this.command = command;
    }

    public String getCommand(){
        return command;
    }
}


