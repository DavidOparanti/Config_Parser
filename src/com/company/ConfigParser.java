package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ConfigParser {

    private String fileName;   //stores the fileName. this was initialize in the constructors.
    private final HashMap<String, String> map = new HashMap<>();   //Stores the key value pairs of the config file


    /**
     * Default contructor
     * It default enviroment to production if no argument is passed when
     * the ConfigParser class is instantiated.
     * @throws FileNotFoundException FileNotFoundException
     */
    public ConfigParser() throws FileNotFoundException {
        this.fileName = "config.txt";
        convertFileToMap();                 //This method need to be called inside the constructor like so.
                                            // I need it to read and convert the config file to HashMap when
                                            // the class is instantiated.
    }
    /**
     * The secondary constructor.
     * It assign config file appropriately base the environment passed
     * When the ConfigParser class is instantiated.
     * @param environment for the environment.
     * @throws FileNotFoundException FileNotFoundException
     */
    public ConfigParser(String environment) throws FileNotFoundException {

        if(environment.toLowerCase().equals("staging")) {
            this.fileName = "config.txt.staging";
            convertFileToMap();                             //This method need to be called inside the constructor like so.
                                                            // I need it to read and convert the config file to  HashMap
                                                             //when the class is instantiated.
        } else if(environment.toLowerCase().equals("development")) {
            this.fileName = "config.txt.dev";
            convertFileToMap();                         //This method need to be called inside the constructor like so.
                                                        // I need it to read and convert the config file to  HashMap
                                                        // when the class is instantiated.
        }


    }

    /**
     *
     * @param key key
     * @return the value of the key passed.
     */
    public String get(String key) {
        if(map.size() > 0) {
            return map.getOrDefault(key, "Invalid key");
        }
        return this.logInvalidEnvironmentsError();                  // return error message if invalid environmet is passed.

    }


    public String logInvalidEnvironmentsError() {
        return "Invalid Environment. Do you mean staging or development or production?\n" +
                "For production environment, call without passing any argument\n" +
                "e.g {java Main}               for production environment\n" +
                "    {java Main development}   for development environment\n" +
                "    {java Main staging}       for staging environment";
    }

    /**
     * This method read through the config file and populate the map
     * base the environment passed.
     * @throws FileNotFoundException FileNotFoundException
     */
    public void convertFileToMap() throws FileNotFoundException {
        String sourceOfFile = "src/com/company/configFile/"+ this.fileName;

        File fis = new File(sourceOfFile);
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains("=")) {                              //Only read character that has key value pairs.
                String[] lineIput = line.split("=");

                if(!map.containsKey(lineIput[0])) {               //Ignore duplicate key.
                    map.put(lineIput[0], lineIput[1]);
                }

            }
        }

    }


}
