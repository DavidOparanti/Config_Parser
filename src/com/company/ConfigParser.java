package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConfigParser {
    //private  String environment;
    private String fileName;
    private HashMap<String, String> JsonObject = new HashMap<>();



    public ConfigParser() throws FileNotFoundException {
        this.fileName = "config.txt";
        convertFileToMap();
    }

    public ConfigParser(String environment) throws FileNotFoundException {
        if(environment.toLowerCase() == "staging") {
            this.fileName = "config.txt.staging";

        } else if(environment.toLowerCase() == "development") {
            this.fileName = "config.txt.dev";
        }
        convertFileToMap();

    }

    public void convertFileToMap() throws FileNotFoundException {
        String sourceOfFile = "src/com/company/configFile/"+ this.fileName;

        File fis = new File(sourceOfFile);
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains("=")) {
                String[] lineIput = line.split("=");

                if(!JsonObject.containsKey(lineIput[0])) {
                    JsonObject.put(lineIput[0], lineIput[1]);
                }

            }
        }

        System.out.println(JsonObject.toString());
    }

    public String get(String key) {

        return key;
    }

/**
 * This method is no longer in used. convertFileToMap method render this method useless.
 */
//    public String[] converStringToArray (String text) {
//        //text = "name=david\nage=none\nsex=male\ncity=lagos[applicatin]\nname=dan";
//        int indexStart = text.indexOf("[");
//        int indexende = text.indexOf("]");
//        text = text.substring(0,indexStart) + text.substring(indexende + 1);
//        String[] textJson = text.split("=");
//        return textJson;
//    }



}
