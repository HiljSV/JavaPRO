package com.hiljsv;

import org.springframework.stereotype.Component;

@Component
public class SimpleMassageProvider implements MessageProvider {
    @Override
    public String getMassage() {
        return "Hello World!";
    }
}
