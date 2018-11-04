package com.hiljsv;

public class SimpleMassageProvider implements MessageProvider {
    @Override
    public String getMassage() {
        return "Hello World!";
    }
}
