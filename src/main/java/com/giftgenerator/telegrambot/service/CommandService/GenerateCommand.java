package com.giftgenerator.telegrambot.service.CommandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateCommand implements Command{

    @Autowired
    ShowCommand showCommand;
    @Autowired
    NextCommand nextCommand;

    @Override
    public String run() {
        showCommand.setNum(0);
        nextCommand.setNum(0);
        return "For whom are u looking a present\n" +
                "man(/man) or woman(/woman)";
    }
}
