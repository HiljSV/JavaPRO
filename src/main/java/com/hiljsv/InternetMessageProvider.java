package com.hiljsv;

public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMassage() {
        return "Message reciver from the Internet";
    }
}
