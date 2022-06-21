package com.mycompany.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        CalOperation cal = new CalOperation();

        System.out.println("--------------------------- Calculator -----------------------------");

        System.out.println("");

        System.out.println("1. Sum\t\t 2. Sub\t\t 3. Div\t\t 4. Multiply\t 5. Modulus");
        
        System.out.println("");
        
        System.out.println("6. Root\t\t 7. x!\t\t 8. ln()\t 9. log()\t 10. sinx");

        System.out.println("");
        
        System.out.println("11. cosx\t 12. tanx\t 13. scex\t 14. cosecx\t 15. cotx");

        System.out.println("");

        System.out.print("Choice your suitable option : ");

        int n = s.nextInt();

        System.out.print("Enter total number of input : ");

        int size = s.nextInt();

        if (size == 1) {

            System.out.print("Enter any one number : ");

            cal.x = s.nextDouble();

        } else if (size == 2) {

            System.out.print("Enter any two number : ");

            cal.x = s.nextDouble();
            cal.y = s.nextDouble();

        } else {
            System.out.println("Sorry, you can input maximum two number !!!");
        }

        switch (n) {
            case 1 -> {
                cal.sum();
                break;
            }
            case 2 -> {

                cal.sub();
                break;
            }
            case 3 -> {
                cal.div();
                break;
            }
            case 4 -> {
                cal.multi();
                break;
            }
            case 5 -> {
                cal.modu();
                break;
            }
            case 6 -> {
                cal.root();
                break;
            }
            case 7 -> {
                cal.fact();
                break;
            }
            case 8 -> {
                cal.ln();
                break;
            }
            case 9 -> {
                cal.log();
                break;
            }
            case 10 -> {
                cal.sin();
                break;
            }
            case 11 -> {
                cal.cos();
                break;
            }
            case 12 -> {
                cal.tan();
                break;
            }
            case 13 -> {
                cal.sec();
                break;
            }
            case 14 -> {
                cal.cosec();
                break;
            }
            case 15 -> {
                cal.cot();
                break;
            }
        }

    }
}
