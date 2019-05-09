package com.stackroute.practiceFive;


import java.util.HashMap;
import java.util.Scanner;

//3. Write a program where an array of strings is input and output is a Map<​ String​ ,boolean> where
//each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array
//Input :​ ​ String​ arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
public class TwoOrMoreForString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");        //read the limit
        int limit = scanner.nextInt();
        String[] inputArray = new String[limit];
        System.out.println("Enter the elements: "); //read the elements
        for (int i = 0; i < limit; i++) {
            inputArray[i] = scanner.nextLine();
        }
        HashMap<String, Integer> countString = new HashMap<>();    //map to enter the string and its corresponding count
        HashMap<String, Boolean> checkString = new HashMap<>();    //map to enter the string and its boolean value
        for (String st : inputArray) {
            if (countString.containsKey(st)) {
                countString.put(st, countString.get(st) + 1); //entering the count of each string
                checkString.put(st, true);   //entering if the string value is 2 or more
            } else {
                countString.put(st, 1);
            }
        }

        for (String st : inputArray) {
            if (countString.get(st) == 1)      //if the value of string is 1, check string map will enter the strings corresponding value as false
            {
                checkString.put(st, false);
            }
        }
        checkString.remove("");     //removing the space
        System.out.println(checkString);        //printing the check string map
    }
}
