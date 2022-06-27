package com.openrdc.openrdc.model;

/**
 * Class where are contained shared settings and variables, this class is a singleton
 * */
public class SharedSettings {

    /**
     * Instance of the class
     * */
    public static SharedSettings instance = null;

    /**
     * Constructor, it is private because this class is a singleton
     * */
    private SharedSettings(){

    }

    /**
     * Method used to get SharedSettings class instance
     * @return object instance of SharedSettingsClass
     * */
    public static SharedSettings GetInstance(){
        if(instance == null){
            synchronized (SharedSettings.class){
                if(instance == null){
                    instance = new SharedSettings();
                }
            }
        }
        return instance;
    }


}
