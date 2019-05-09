package com.stackroute.practiceFive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

//2. Write a program to find the number of counts in the following String. Store the output in
//Map<String,Integer> as key value pair.
//Input : String str = “one one -one___two,,three,one @three*one?two”;
//Output : {"one":5 , "two":2, "three" :2}
public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String input = " one one -one___two,,three,one @three*one?two ";
        Map<String, Integer> mapContents = new HashMap<>();

        String[] inputArray = input.split(" |-|,|___|,,|@|[*]|[?]");  //splitting the strings from special characters

        for (String s : inputArray) {

            if (mapContents.containsKey(s)) {
                mapContents.put(s, mapContents.get(s) + 1);            //counting the occurence of the strings
            } else {
                mapContents.put(s, 1);
            }
        }
        mapContents.remove("");
        System.out.println(mapContents);

    }
}
