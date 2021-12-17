package com_group1.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {

    private static final Properties properties = new Properties();

    static {

        try{
            FileInputStream stream = new FileInputStream("configuration.properties");
            properties.load(stream);
            stream.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
