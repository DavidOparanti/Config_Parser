package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String environment;
        if(args.length == 0) {
            environment = "production";

        } else {
            environment = args[0];
        }

        ConfigParser config = new ConfigParser(environment);
        config.convertFileToMap();



    }
}
