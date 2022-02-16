package com.knoldus.kup.lambda.Assignment2;
import java.util.Scanner;
import java.util.function.Function;
public class FindNextEven {
    public static void main(String... args){
        System.out.println("Compiled by Ranu Rajput ");
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        long longnum = sc.nextLong();
        // Lambda expression return -> next even value
        Function<Long, Long> evenNumber = number -> number + 2 -(number%2);
        // Function Calling
        Long EvenNumber = evenNumber.apply(longnum);
        System.out.println("Next even number is " +EvenNumber);
    }
}
