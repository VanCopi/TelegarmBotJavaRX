package com.github.javarushcommunity.javarush_telegrambot.service;

import com.github.javarushcommunity.javarush_telegrambot.bot.JavarushTelegramBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;

@DisplayName("Unit-level testing for SendBotMessageService")
public class SendBotMessageServiceTest {

    private SendBotMessageService sendBotMessageService;
    private JavarushTelegramBot javarushBot;

    @BeforeEach
    public void Init() {
        javarushBot = Mockito.mock(JavarushTelegramBot.class);
        sendBotMessageService = new SendBotMessageServiceImpl(javarushBot);
    }

    @Test
    public void shouldProperlySendMessage() throws TelegramApiException {
        String chatId = "test_chat_id";
        String message = "test_message";

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(message);
        sendMessage.enableHtml(true);
        sendMessage.setChatId(chatId);

        sendBotMessageService.sendMessage(chatId, message);

        Mockito.verify(javarushBot).execute(sendMessage);
    }
}
