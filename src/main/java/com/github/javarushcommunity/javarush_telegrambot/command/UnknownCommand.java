package com.github.javarushcommunity.javarush_telegrambot.command;

import org.telegram.telegrambots.meta.api.objects.Update;
import com.github.javarushcommunity.javarush_telegrambot.service.SendBotMessageService;

public class UnknownCommand implements Command {


    public final SendBotMessageService sendBotMessageService;

    public final static String UNKNOWN_MESSAGE = "Эта команда мне неизвеста или это не является " +
            "допустимой командой. /help - список команд";

    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_MESSAGE);
    }
}
