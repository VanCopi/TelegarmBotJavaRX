package com.github.javarushcommunity.javarush_telegrambot.command;

import com.github.javarushcommunity.javarush_telegrambot.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;
import com.github.javarushcommunity.javarush_telegrambot.service.SendBotMessageService;

public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет. Я Javarush Telegram Bot, созданный для отслеживания " +
            "последних статей интересных авторов. Я еще маленький и в процессе разработки";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
