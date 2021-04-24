package com.giftgenerator.telegrambot.service.CommandService;

import com.giftgenerator.telegrambot.service.CommandService.MansCommands.HusbandCommand;
import com.giftgenerator.telegrambot.service.CommandService.MansCommands.SonCommand;
import com.giftgenerator.telegrambot.service.CommandService.WomansCommands.DaughterCommand;
import com.giftgenerator.telegrambot.service.CommandService.WomansCommands.WifeCommand;
import com.giftgenerator.telegrambot.service.MessageService;
import com.giftgenerator.telegrambot.service.UserForGift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MainCommandService {
    @Autowired
    UserForGift userForGift;
    @Autowired
    MessageService messageService;

    @Autowired
    StartCommand startCommand;
    @Autowired
    GenerateCommand generateCommand;
    @Autowired
    ShowCommand showCommand;
    @Autowired
    ExitCommand exitCommand;
    @Autowired
    NoneCommand noneCommand;
    @Autowired
    NextCommand nextCommand;

    @Autowired
    ManCommand manCommand;
    @Autowired
    HusbandCommand husbandCommand;
    @Autowired
    SonCommand sonCommand;

    @Autowired
    WomanCommand womanCommand;
    @Autowired
    WifeCommand wifeCommand;
    @Autowired
    DaughterCommand daughterCommand;

    public void dispatch(Update update){
        switch (getCommand(update)){
            case START:
                messageService.sendMessage(update.getMessage(),startCommand.run());
                break;
            case GENERATE:
                messageService.sendMessage(update.getMessage(),generateCommand.run());
                break;
            case SHOW:
                messageService.sendMessage(update.getMessage(),showCommand.run());
                break;
            case NEXT:
                messageService.sendMessage(update.getMessage(),nextCommand.run());
                break;
            case EXIT:
                messageService.sendMessage(update.getMessage(),exitCommand.run());
                break;
            case NONE:
                messageService.sendMessage(update.getMessage(),noneCommand.run());
                break;
////////////////////////////////////////////////////////////////////////////////////////////////////
            case MAN:
                messageService.sendMessage(update.getMessage(),manCommand.run());
                break;
            case HUSBAND:
                messageService.sendMessage(update.getMessage(),husbandCommand.run());
                break;
            case SON:
                messageService.sendMessage(update.getMessage(),sonCommand.run());
                break;
////////////////////////////////////////////////////////////////////////////////////////////////////
            case WOMAN:
                messageService.sendMessage(update.getMessage(),womanCommand.run());
                break;
            case WIFE:
                messageService.sendMessage(update.getMessage(),wifeCommand.run());
                break;
            case DAUGHTER:
                messageService.sendMessage(update.getMessage(),daughterCommand.run());
        }
    }

    private BotCommands getCommand(Update update){
        if(update.hasMessage()){
            Message message = update.getMessage();
            if(message != null){
                String msgText = message.getText();
                if(msgText.startsWith(BotCommands.START.getCommand()))
                    return BotCommands.START;
                if(msgText.startsWith(BotCommands.GENERATE.getCommand()))
                    return BotCommands.GENERATE;
                if(msgText.startsWith(BotCommands.SHOW.getCommand()))
                    return BotCommands.SHOW;
                if(msgText.startsWith(BotCommands.NEXT.getCommand()))
                    return BotCommands.NEXT;
                if(msgText.startsWith(BotCommands.EXIT.getCommand()))
                    return BotCommands.EXIT;
////////////////////////////////////////////////////////////////////////////////////////////////////
                if(msgText.startsWith(BotCommands.MAN.getCommand()))
                    return BotCommands.MAN;
                if(msgText.startsWith(BotCommands.HUSBAND.getCommand()))
                    return BotCommands.HUSBAND;
                if(msgText.startsWith(BotCommands.SON.getCommand()))
                    return BotCommands.SON;
////////////////////////////////////////////////////////////////////////////////////////////////////
                if(msgText.startsWith(BotCommands.WOMAN.getCommand()))
                    return BotCommands.WOMAN;
                if(msgText.startsWith(BotCommands.WIFE.getCommand()))
                    return BotCommands.WIFE;
                if(msgText.startsWith(BotCommands.DAUGHTER.getCommand()))
                    return BotCommands.DAUGHTER;
            }
        }
        return BotCommands.NONE;
    }
}
