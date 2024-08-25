package com.mycompany.assignment1;

public class Assignment1 {

    public static void main(String[] args) {
        System.out.println("ArithmeticOperation");
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations(144,25);
        System.out.println("Addtion = " +arithmeticOperations.getAddition());
        System.out.println("Substraction = " +arithmeticOperations.getSubstraction());
        System.out.println("Multiplication = " +arithmeticOperations.getMultiplication());
        System.out.println("Division = " +arithmeticOperations.getDivision());
    }
}
