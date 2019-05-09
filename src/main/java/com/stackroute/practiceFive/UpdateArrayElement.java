package com.stackroute.practiceFive;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. Write a Java program to update specific array element by given element and empty the array list.
//Input: [Apple, Grape, Melon, Berry]
//Output: [Kiwi, Grape, Mango, Berry]
//Array list after removing all elements []
public class UpdateArrayElement {

    public static void main(String[] args) {
        List<String> inputArray = new ArrayList<>();  //initialising the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit: ");        //entering limit
        int limit = scanner.nextInt();
        System.out.println("Enter the elements: ");     //entering the elements
        for (int i = 0; i < limit; i++) {
            inputArray.add(scanner.next());           //adding the elements to the array list
        }

        System.out.println(inputArray); //printing the array list


        //updating an element position
        System.out.println("Enter update element position");
        int position = scanner.nextInt();
        System.out.println("Enter update element");
        String newElement = scanner.next();

        inputArray.set(position, newElement);

        System.out.println("Updated array list : ");
        System.out.println(inputArray);

        //removed all elements from array list
        inputArray.clear();
        System.out.println("Updated array list : ");
        System.out.println(inputArray);
    }

}
