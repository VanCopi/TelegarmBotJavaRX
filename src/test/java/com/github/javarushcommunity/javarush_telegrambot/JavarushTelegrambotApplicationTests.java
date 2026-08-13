package com.github.javarushcommunity.javarush_telegrambot;

import com.github.javarushcommunity.javarush_telegrambot.bot.JavarushTelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.mockito.Mockito.mock;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
        "bot.username=test_bot",
        "bot.token=test_token"
})
class JavarushTelegrambotApplicationTests {

    @Configuration
    static class TestConfig {
        @Bean
        public TelegramBotsApi telegramBotsApi() {
            return mock(TelegramBotsApi.class);
        }
    }

    @MockitoBean
    private JavarushTelegramBot javarush_RX_community_bot;

	@Test
	void contextLoads() {
	}

}
