package com.stackroute.practiceFive;

//4. Create a StudentCHECKER class that represents the following information of a student: id, name, and age
//all the member variables should be private .
//a. Implement `getter and setter` .
//b. Create a `StudentSorter` class that implements `Comparator interface` .
//c. Write a class `STUDENT` create StudentCHECKER class object(minimum 5)
//d. Add these student object into a List of type Student .
//e. Sort the list based on their age in decreasing order, for student having
//same age, sort based on their name.
//f. For students having same name and age, sort them according to their ID.

import java.io.PrintStream;
import java.util.*;


public class Student {
    public static void main(String[] args) {
        ArrayList<StudentChecker> arrayList = new ArrayList<>();

        //create student checker objects
        StudentChecker student1 = new StudentChecker("01", "Harry", 22);
        StudentChecker student2 = new StudentChecker("02", "Berry", 26);
        StudentChecker student3 = new StudentChecker("03", "Riya", 35);
        StudentChecker student4 = new StudentChecker("04", "Kanchal", 29);
        StudentChecker student5 = new StudentChecker("05", "Riya", 26);

//adding the student objects to array list
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);

        //getting the iterator
        Iterator iterator = arrayList.iterator();

        //printing the array list
        while (iterator.hasNext()) {
            StudentChecker student = (StudentChecker) iterator.next();
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
        }
        Collections.sort(arrayList, new StudentChecker.StudentSorter());

//printing the sorted list
        System.out.println(("\n\nThe sorted list is : \n"));
        for (int i = 0; i < arrayList.size(); ++i) {

            PrintStream var1 = System.out;
            String var2 = ((StudentChecker) arrayList.get(i)).getId();
            var1.println(var2 + " " + ((StudentChecker) arrayList.get(i)).getName() + " " + ((StudentChecker) arrayList.get(i)).getAge());

        }
    }

    //creating the student checker class and initialising the variables
    static class StudentChecker {

        private String id;
        private String name;
        private int age;

        //constructor method for student checker
        public StudentChecker(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        //setter and getter methods for the variables
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        //creating the class and implements the comparator interface
        static class StudentSorter implements Comparator {
            StudentSorter() {

            }

            //compare function to compare the array list elements
            @Override
            public int compare(Object o1, Object o2) {
                StudentChecker s1 = (StudentChecker) o1;
                StudentChecker s2 = (StudentChecker) o2;

                if (s1.getAge() == s2.getAge()) {
                    int answer = s1.getName().compareTo(s2.getName());
                    return answer == 0 ? s1.getId().compareTo(s2.getId()) : answer;
                } else {
                    return s1.getAge() > s2.getAge() ? 1 : -1;
                }
            }
        }


    }
}

