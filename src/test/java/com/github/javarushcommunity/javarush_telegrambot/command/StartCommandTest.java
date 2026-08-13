package com.github.javarushcommunity.javarush_telegrambot.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.javarushcommunity.javarush_telegrambot.command.CommandName.START;
import static com.github.javarushcommunity.javarush_telegrambot.command.StartCommand.START_MESSAGE;


@DisplayName("unit-level testing for StartCommand")
public class StartCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return START.getCommandName();
    }
    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }
}
