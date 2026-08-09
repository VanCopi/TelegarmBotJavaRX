package com.github.javarushcommunity.javarush_telegrambot.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.javarushcommunity.javarush_telegrambot.command.CommandName.NO;
import static com.github.javarushcommunity.javarush_telegrambot.command.NoCommand.NO_MESSAGE;


@DisplayName("unit-level testing for NoCommand")
public class NoCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return NO.getCommandName();
    }
    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }
}
