package com.github.javarushcommunity.javarush_telegrambot.command;

import com.github.javarushcommunity.javarush_telegrambot.service.TelegramUserServiceImpl;
import org.junit.jupiter.api.DisplayName;

import static com.github.javarushcommunity.javarush_telegrambot.command.CommandName.STOP;
import static com.github.javarushcommunity.javarush_telegrambot.command.StopCommand.STOP_MESSAGE;
import org.mockito.Mockito;
import com.github.javarushcommunity.javarush_telegrambot.service.TelegramUserService;


@DisplayName("Unit-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        TelegramUserService telegramUserService = Mockito.mock(TelegramUserService.class);
        return new StopCommand(sendBotMessageService, telegramUserService);
    }
}