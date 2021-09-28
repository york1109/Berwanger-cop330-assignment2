/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brice Berwanger
 */
package ex25;
import java.io.*;
import java.util.*;

class excercise25 {


    public static void passwordValidator(String input)
    {

        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }


        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.println("is a Very Strong password");
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.println("is a Strong password");
        else if(hasLower || hasUpper && (n < 8))
            System.out.print("is a Weak password");
        else
            System.out.print("is a Very Weak password");

    }


    public static void main(String[] args)
    {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");
        input=sc.nextLine();
        passwordValidator(input);
    }


}