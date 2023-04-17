package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("*** Welcome to LINE COMPARISON COMPUTATION PROGRAM ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a1 = ");
        int a1 = scanner.nextInt();
        System.out.print("Enter the value of b1 = ");
        int b1 = scanner.nextInt();
        System.out.print("Enter the value of a2 = ");
        int a2 = scanner.nextInt();
        System.out.print("Enter the value of b2 = ");
        int b2 = scanner.nextInt();
        double lengthOfLine;

        lengthOfLine = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));

        System.out.println("The Length of a Line = " +lengthOfLine);

    }
}
