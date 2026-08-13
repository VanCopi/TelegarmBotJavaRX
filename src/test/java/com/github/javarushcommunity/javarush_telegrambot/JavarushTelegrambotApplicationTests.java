package com.github.javarushcommunity.javarush_telegrambot;

import com.github.javarushcommunity.javarush_telegrambot.bot.JavarushTelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class JavarushTelegrambotApplicationTests {

    @MockitoBean
    private JavarushTelegramBot javarush_RX_community_bot;

	@Test
	void contextLoads() {
	}

}
