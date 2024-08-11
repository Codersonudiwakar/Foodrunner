package com.foodrunner.app;

import java.util.Random;

import org.springframework.context.annotation.Configuration;

import java.util.HashSet;


@Configuration
public class UniqueCodeGenerator {
    private static final String PREFIX = "PAY";
    private static final int CODE_LENGTH = 8;
    private static final HashSet<String> usedCodes = new HashSet<>();
    private static final Random random = new Random();

    public String generateUniqueCode() {
        String code;
        do {
            StringBuilder sb = new StringBuilder(PREFIX);
            for (int i = 0; i < CODE_LENGTH; i++) {
                sb.append(random.nextInt(10));
            }
            code = sb.toString();
        } while (!usedCodes.add(code));

        return code;
    }
}