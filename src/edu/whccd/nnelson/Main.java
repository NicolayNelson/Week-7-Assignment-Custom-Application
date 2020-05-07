package edu.whccd.nnelson;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
This project is to show the use of an Array and an ArrayList and to compare how they are the same and how they are different
Author Nicolay Nelson
 */



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Use grades[index] to assign values to the 5 indices (0-4)");
        System.out.print("Enter grade (0-100):");
        int zero = input.nextInt();
        System.out.print("Enter grade (0-100):");
        int one = input.nextInt();
        System.out.print("Enter grade (0-100):");
        int two = input.nextInt();
        System.out.print("Enter grade (0-100):");
        int three = input.nextInt();
        System.out.print("Enter grade (0-100):");
        int four = input.nextInt();


        double totalGrades = 0;
        double[] grades = new double[5];
        grades[0] = zero;
        grades[1] = one;
        grades[2] = two;
        grades[3] = three;
        grades[4] = four;

        for (int i = 0; i < grades.length; i++) {

            System.out.println("grades[" + i + "]: " + grades[i]);
            totalGrades += grades[i];
        }
        double average = totalGrades / grades.length;
        System.out.println("Grades Length:   " + grades.length);
        System.out.println("Grades Total:    " + totalGrades);
        System.out.println("Grades Average:   " + average);
        System.out.println();
        System.out.println("****************************************");
        System.out.println();
        System.out.println("Collect city names using a do-while loop");


        ArrayList<String> cities = new ArrayList<>();
        String continueFlag;
        do {
            System.out.print("Enter city name:   ");
            String cityName = input.next();
            cities.add(cityName);

            System.out.print("More cities to add (y/n)? ");
            continueFlag = input.next();
        } while (continueFlag.equalsIgnoreCase("y"));
        System.out.println();
        System.out.println("Sort the ArrayList using Collections.sort()");
        System.out.println();
        System.out.println("Use a for each loop to traverse through the cities ArrayList");
        Collections.sort(cities);
        for (String s : cities) {
                System.out.println(s);
        }
                System.out.println("Cities size:    " + cities.size());
    }
}


