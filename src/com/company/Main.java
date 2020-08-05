package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {

        if(args.length < 1) {
            ConfigParser config = new ConfigParser();
            System.out.println(config.get("hosts")); // for production environment
        } else {
            ConfigParser config = new ConfigParser(args[0]);
            System.out.println(config.get("modes")); // for staging and development environment
        }

    }
}
