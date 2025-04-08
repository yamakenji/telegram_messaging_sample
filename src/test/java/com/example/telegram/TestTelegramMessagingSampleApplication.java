package com.example.telegram;

import org.springframework.boot.SpringApplication;

public class TestTelegramMessagingSampleApplication {

    public static void main(String[] args) {
        SpringApplication.from(TelegramMessagingSampleApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
