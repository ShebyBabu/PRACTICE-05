package com.stackroute.practiceFive;


//5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//Modify and return the given map as follows:
//a. If the key `val1` has
//b. Set the key `val1` to
//Example 1:
//The map {"val1": "java",
//"java"}
//Example 2:
//The map {"val1": "mars",
//"mars"}
//a value, set the key `val2` to have that value, and
//have the value `" "` (empty​ ​ string​ ).
//"val2": "c++"} should return {"val1": " ", "val2":
//"val2": "saturn"}
//should return {"val1": " ", "val2":

import java.util.*;

public class TwoKeyValue {
    public static void main(String[] args) {
        Map<String, String> mapContent = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values");         //enter values for the two keys
        String value1 = scanner.next();
        String value2 = scanner.next();

        mapContent.put("value1", value1);        //storing the key and value inside the map
        mapContent.put("value2", value2);


        System.out.println(mapContent);
        if (mapContent.size() >= 2)        //if the size of the map is greate than or equal to 2
        {
            mapContent.put("value2", mapContent.get("value1"));      //insert the value of key 1 to value 2
            mapContent.put("value1", " ");               //making value null of key 1
            System.out.println(mapContent); //printing the map


        }
    }
}
