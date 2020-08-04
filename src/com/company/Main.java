package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException  {
	// write your code here


        ConfigParser config = new ConfigParser("staging");

        System.out.println(config.get("mode"));



    }
}
