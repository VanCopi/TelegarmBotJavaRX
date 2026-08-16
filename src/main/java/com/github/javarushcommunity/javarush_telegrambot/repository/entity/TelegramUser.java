package com.github.javarushcommunity.javarush_telegrambot.repository.entity;

import jakarta.persistence.Id;
import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "tg_user")
public class TelegramUser {

    @Id
    @Column(name = "chat_id")
    private String chatId;

    @Column(name = "active")
    private boolean active;

    public String setChatId(String chatId) {
        return this.chatId = chatId;
    }
    public boolean setActive(boolean active) {
        return this.active = active;
    }
}
