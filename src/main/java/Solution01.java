/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;


public class Solution01
{

    /*
    prompt user to enter a name
    reader that name into a string variable called name
    print out the introduction of yourself/name
    */


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }



}
