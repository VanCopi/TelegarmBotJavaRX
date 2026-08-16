package com.github.javarushcommunity.javarush_telegrambot.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.javarushcommunity.javarush_telegrambot.command.CommandName.START;
import static com.github.javarushcommunity.javarush_telegrambot.command.StartCommand.START_MESSAGE;
import com.github.javarushcommunity.javarush_telegrambot.service.TelegramUserService;
import org.mockito.Mockito;

@DisplayName("Unit-level testing for StartCommand")
class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        TelegramUserService telegramUserService = Mockito.mock(TelegramUserService.class);
        return new StartCommand(sendBotMessageService, telegramUserService);
    }
}