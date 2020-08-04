package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConfigParser {
    //private  String environment;
    private String fileName;
    private HashMap<String, String> JsonObject = new HashMap<>();




    public ConfigParser(String fileName)  {
        this.fileName = fileName;

    }

    public void convertFileToMap() throws FileNotFoundException {
        File fis = new File("src/com/company/config.txt");
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.contains("=")) {
                String[] lineIput = line.split("=");
                JsonObject.put(lineIput[0], lineIput[1]);
            }
        }

        System.out.println(JsonObject.toString());
    }
    public String[] converStringToArray (String text) {
        //text = "name=david\nage=none\nsex=male\ncity=lagos[applicatin]\nname=dan";
        int indexStart = text.indexOf("[");
        int indexende = text.indexOf("]");
        text = text.substring(0,indexStart) + text.substring(indexende + 1);
        String[] textJson = text.split("=");
        return textJson;
    }



    public String get(String value){


       return "key";
    }




}
