package com.stackroute.practiceFive;

//6. Write a program to implement set interface which sorts the given randomly ordered names inascending order. Convert the sorted set in to an ​ array list
//Input : Harry Olive Alice Bluto Eugene
//Output :
//Sorted Set : Alice Bluto Eugene Harry Olive
//Array list​ from Set : Alice Bluto Eugene Harry Olive

import java.util.*;

public class SortingUsingSet {
    public static void main(String[] args) {
        Set<String> elements = new TreeSet<>();           //creating a set of string data type
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit: ");        //enter the limit
        int limit = scanner.nextInt();
        for (int i = 0; i < limit; i++) {
            elements.add(scanner.next());       //enter the names and add to the set
        }
        System.out.println(elements);

        System.out.print("Array list from set: ");
        List<String> arrayList = new ArrayList<>(elements);       //converting set to list
        System.out.println(arrayList);      //printing the list

    }
}
