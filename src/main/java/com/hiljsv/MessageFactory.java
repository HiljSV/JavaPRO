package com.hiljsv;

import java.io.InputStream;
import java.util.Properties;

public class MessageFactory {
    public static MessageProvider provider;
    public static MessageRenderer renderer;

    static {
        Properties properties = new Properties();
        try (InputStream inputStream = MessageFactory.class.getClassLoader().getResourceAsStream("app.properties")) {
            properties.load(inputStream);
            String messageProviderClass = properties.getProperty("messageProviderClass");
            String messageRendererClass = properties.getProperty("messageRendererClass");
            provider = (MessageProvider) Class.forName(messageProviderClass).newInstance();
            renderer = (MessageRenderer) Class.forName(messageRendererClass)
                    .getConstructor(MessageProvider.class).newInstance(provider);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MessageProvider getProvider() {
        return provider;
    }

    public static MessageRenderer getRenderer() {
        return renderer;
    }
}
