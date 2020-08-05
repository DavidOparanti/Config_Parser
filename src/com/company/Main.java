package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException  {
	//write your code here
        if(args.length < 1) {
            ConfigParser config = new ConfigParser();
            System.out.println(config.get("hoster")); // for production environment
        } else {
            ConfigParser config = new ConfigParser(args[0]);
            System.out.println(config.get("modesty")); // for stanggin and development environment
        }

    }
}
