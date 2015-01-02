package com.c0d3sc1b3r.javautils;

import java.util.regex.Pattern;

/**
 * Created by Eyal on 02-1-15.
 */
public class RegExpTester {
    public static void main(String[] args) {
        if ( ! validateArgs(args) ){
            help();
        }else {
            String regexpToTest = args[0];
            String textToMatch = args[1];
            if( Pattern.matches(regexpToTest, textToMatch.trim()) ){
                System.out.println("match!");
            }
        }

    }

    public static boolean validateArgs(String[] args){
        boolean ok = args != null &&
                args.length >= 2 &&
                args[0] != null && args[1] != null;
        return ok;
    }

    public static void help(){
        System.out.println("syntax: [regexp to text] [string to test]");
    }
}
