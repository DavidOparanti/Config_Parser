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

        String text = "name=david\nage=none\nsex=male\ncity=lagos[applicatin]\nname=dan";
        int indexStart = text.indexOf("[");
        int indexende = text.indexOf("]");
        text = text.substring(0,indexStart) + text.substring(indexende + 1);
        String[] textJson = text.split("=");

        System.out.println(Arrays.toString(textJson));

    }
}
