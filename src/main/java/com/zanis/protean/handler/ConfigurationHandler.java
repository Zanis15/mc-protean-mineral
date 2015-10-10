package com.zanis.protean.handler;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void  init(File configFile){
        configuration = new Configuration(configFile);
        boolean configValue = false;

        try{
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e){
            // Log the exception
        }
        finally{
            // Save the configuration file
            if (configuration.hasChanged()){
                configuration.save();
            }
        }
        System.out.println("Configuration Test: " + configValue);
    }
}
