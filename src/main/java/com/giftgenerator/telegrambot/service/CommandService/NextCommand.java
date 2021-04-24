package com.giftgenerator.telegrambot.service.CommandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NextCommand implements Command{
    @Autowired
    ShowCommand showCommand;

    private int num = 0;

    @Override
    public String run() {
        num++;
        showCommand.setNum(num);
        return showCommand.run();
    }

    public void setNum(int num) {
        this.num = num;
    }
}
