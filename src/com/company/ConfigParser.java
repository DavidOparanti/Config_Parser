package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConfigParser {
    //private  String environment;
    private String fileName;



    public ConfigParser(String fileName) throws FileNotFoundException, IOException {
        this.fileName = fileName;

    }


    public void configParser(String environment) {

        switch (environment) {
            case "production":

                break;

            case "development":

                break;

            case "staging" :

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + environment);
        }
    }




}
