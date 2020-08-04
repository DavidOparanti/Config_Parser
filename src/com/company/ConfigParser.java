package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ConfigParser {
    //private  String environment;
    private String fileName;
    private Map<String, String> JsonObject;




    public ConfigParser(String fileName)  {
        this.fileName = fileName;

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
