package com.company;
import java.util.Scanner;

public class ConfigParser {
    private  String environment;


    public ConfigParser(String environment) {
        this.environment = environment;
    }


    public static void configParser() {


    }

    public static void configParser(String environment) {

        switch (environment) {
            case "production":

                configParser();

                break;

            case "development":

                break;

            case "staging" :

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + environment);
        }
    }


    public static void main(String[] args) {
        String environment;
        if(args.length ==0) {
            environment = "production";
        } else {
            environment = args[0];
        }
    }
    ConfigParser config = new ConfigParser();
    config.


}
