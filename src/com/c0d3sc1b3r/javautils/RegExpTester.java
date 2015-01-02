package com.c0d3sc1b3r.javautils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Eyal on 02-1-15.
 */
public class RegExpTester {
    public static void main(String[] args) {
        if ( ! validateArgs(args) ){
            help();
        }else {
            String regexpToTest = args[1];
            String textToMatch = args[2];
            Pattern p = Pattern.compile(regexpToTest);
            Matcher matcher = p.matcher(textToMatch);
            if( matcher != null ){
                System.out.println("got matcher");
                if( matcher.find() ){
                    System.out.println("has a match! ");
                    System.out.println(matcher.toString());
                }
            }
        }

    }

    public static boolean validateArgs(String[] args){
        boolean ok = args != null &&
                args.length >= 3 &&
                args[1] != null && args[2] != null;
        return ok;
    }

    public static void help(){
        System.out.println("syntax: [regexp to text] [string to test]");
    }
}
