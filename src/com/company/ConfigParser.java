package com.company;
import java.util.Scanner;

public class ConfigParser {

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

        }
    }

}
