package com.github.javarushcommunity.javarush_telegrambot.command;

import com.github.javarushcommunity.javarush_telegrambot.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;
import com.github.javarushcommunity.javarush_telegrambot.service.SendBotMessageService;
import com.github.javarushcommunity.javarush_telegrambot.service.TelegramUserService;
import com.github.javarushcommunity.javarush_telegrambot.repository.entity.TelegramUser;

public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;
    private final TelegramUserService telegramUserService;

    public final static String START_MESSAGE = "Привет. Я Javarush Telegram Bot, созданный для отслеживания " +
            "последних статей интересных авторов. Я еще маленький и в процессе разработки";

    public StartCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.sendBotMessageService = sendBotMessageService;
        this.telegramUserService = telegramUserService;
    }

    @Override
    public void execute(Update update) {
        String chatId = update.getMessage().getChatId().toString();

        telegramUserService.findByChatId(chatId).ifPresentOrElse(
                user -> {
                    user.setActive(true);
                    telegramUserService.save(user);
                    },
                () -> {
                    TelegramUser telegramUser = new TelegramUser();
                    telegramUser.setActive(true);
                    telegramUser.setChatId(chatId);
                    telegramUserService.save(telegramUser);
                }
        );

        sendBotMessageService.sendMessage(chatId, START_MESSAGE);
    }
}
