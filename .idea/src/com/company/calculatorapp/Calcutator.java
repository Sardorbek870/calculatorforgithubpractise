package com.company.calculatorapp;


import java.util.Scanner;

public class Calcutator {
    public static void main(String[] args) {
        ServiceCalculator service = new ServiceCalculator();

        Scanner scannerString = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);


        while(true){
            try {
                System.out.println("Enter first number :");
                double number1 = scannerDouble.nextDouble();

                System.out.println("""
                        choose a operation :
                        1. addition
                        2. subtraction
                        3. multiplication
                        4. divition
                        """);
                String option = scannerString.nextLine();
                System.out.println("enter second number ;");
                double number2 = scannerDouble.nextDouble();

                switch (option){
                    case "1" -> service.add(number1, number2);
                    case "2" -> service.subtract(number1, number2);
                    case "3" -> service.multiply(number1, number2);
                    case "4" -> service.divide(number1, number2);
                }
                System.out.println("would you like to do another calculation (type yes) :");
                String choice = scannerString.nextLine();
                if(!choice.toLowerCase().trim().equals("yes")){
                    break;
                }


            }catch ( Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
