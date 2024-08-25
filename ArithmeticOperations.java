package com.mycompany.assignment1;

public class ArithmeticOperations {
    
    private double number1;
    private double number2;
    
   public ArithmeticOperations(double number1,double number2){
       this.number1 = number1;
       this.number2 = number2;
   }
   public double getAddition(){
       return number1 + number2;
   }
   public double getSubstraction(){
       return number1 - number2;
   }
   public double getMultiplication(){
       return number1 * number2;
   }
   public double getDivision(){
       return number1 / number2;
   }
}
