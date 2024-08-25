package com.mycompany.assignment1.evenodd;

import java.util.Scanner;

public class EvenOddOperation {

    public static void main(String[] args) {
        System.out.println("Even and Odd Operation");
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number...");
        number = scanner.nextInt();
        if(number%2 == 0){
            System.out.println("The given number is even....");
        }
        else{
            System.out.println("The given number is odd...");
        }
    }
    
}
