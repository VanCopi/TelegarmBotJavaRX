package com.github.javarushcommunity.javarush_telegrambot.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.javarushcommunity.javarush_telegrambot.command.CommandName.HELP;
import static com.github.javarushcommunity.javarush_telegrambot.command.HelpCommand.HELP_MESSAGE;


@DisplayName("unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }
    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }
}
