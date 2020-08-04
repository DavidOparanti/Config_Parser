package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ConfigParser {
    //Instance variable
    private String fileName;   //stores the fileName. this was initialize in the constructors.
    private final HashMap<String, String> map = new HashMap<>();   //Stores the key value pairs of the config file


    /**
     * Default contructor
     * It default enviroment to production if no argument is passed when
     * the ConfigParser class is instantiated.
     * @throws FileNotFoundException
     */
    public ConfigParser() throws FileNotFoundException {
        this.fileName = "config.txt";
        convertFileToMap();
    }


    /**
     * The secondary constructor.
     * It assign config file appropriately base the environment passed
     * When the ConfigParser class is instantiated.
     * @param environment for the environment.
     * @throws FileNotFoundException
     */
    public ConfigParser(String environment) throws FileNotFoundException {

        if(environment.toLowerCase().equals("staging")) {
            this.fileName = "config.txt.staging";

        } else if(environment.toLowerCase().equals("development")) {
            this.fileName = "config.txt.dev";
        }
        convertFileToMap();

    }

    /**
     *
     * @param key
     * @return the value of the key passed.
     */
    public String get(String key) {
        return map.get(key);
    }

    /**
     * This method read through the config file and populate the map
     * base the environment passed.
     * @throws FileNotFoundException
     */
    public void convertFileToMap() throws FileNotFoundException {
        String sourceOfFile = "src/com/company/configFile/"+ this.fileName;

        File fis = new File(sourceOfFile);
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains("=")) {    //Only read character that has key value pairs.
                String[] lineIput = line.split("=");

                if(!map.containsKey(lineIput[0])) {    // This if statement ignore duplicate key.
                    map.put(lineIput[0], lineIput[1]);
                }

            }
        }

    }






/**
 *
 * This method is no longer in used. convertFileToMap method render it function useless.
 */
   /* public String[] converStringToArray (String text) {
        //text = "name=david\nage=none\nsex=male\ncity=lagos[applicatin]\nname=dan";
        int indexStart = text.indexOf("[");
        int indexende = text.indexOf("]");
        text = text.substring(0,indexStart) + text.substring(indexende + 1);
        String[] textJson = text.split("=");
        return textJson;
    }
*/


}
