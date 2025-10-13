package com.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties props;

    static {
        try {
            props = new Properties();
            FileInputStream file = new FileInputStream("src/main/resources/config.properties");
            props.load(file);
        } catch (IOException e) {
            throw new RuntimeException("❌ Failed to load config.properties file", e);
        }
    }

    public static String getProperty(String key) {
        return props.getProperty(key);
    }
}
