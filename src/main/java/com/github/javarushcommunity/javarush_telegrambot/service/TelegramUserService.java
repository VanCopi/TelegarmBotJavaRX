package com.github.javarushcommunity.javarush_telegrambot.service;

import com.github.javarushcommunity.javarush_telegrambot.repository.TelegramUserRepository;
import com.github.javarushcommunity.javarush_telegrambot.repository.entity.TelegramUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface TelegramUserService {

    void save(TelegramUser telegramUser);

    List<TelegramUser> retrieveAllActiveUser();

    Optional<TelegramUser> findByChatId(String chatId);
}
