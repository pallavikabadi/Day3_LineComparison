package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("*** Welcome to LINE COMPARISON COMPUTATION PROGRAM ***");
        //UC1
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
        
        //UC2
        System.out.print("Enter the value of a3 = ");
        int a3 = scanner.nextInt();
        System.out.print("Enter the value of b3 = ");
        int b3 = scanner.nextInt();
        System.out.print("Enter the value of a4 = ");
        int a4 = scanner.nextInt();
        System.out.print("Enter the value of b4 = ");
        int b4 = scanner.nextInt();
        double lengthOfLine2;
        lengthOfLine2 = Math.sqrt(Math.pow((a4-a3),2) + Math.pow((b4-b3),2));
        System.out.println("The Length of a Line = " +lengthOfLine2);

        String line = String.valueOf(lengthOfLine);
        String line2 = String.valueOf(lengthOfLine2);
        if (line.equals(line2))
            System.out.println("Two Lines are EQUAL");
        else
            System.out.println("Two Lines are NOT Equal");
        
        //UC3
        if (line1.compareTo(line2) == 0)
            System.out.println("Two Lines are EQUAL");
        else if (line1.compareTo(line2) > 0)
            System.out.println("Line1 is GREATER Than Line2");
        else if (line1.compareTo(line2) < 0)
            System.out.println("Line1 is LESSER Than Line2");

    }
}
