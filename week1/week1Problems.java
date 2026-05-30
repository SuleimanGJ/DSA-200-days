import java.util.*;
public class week1Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // A. Hello World    
    // Your task is to print the string Hello World.
    // Input
    // There is no input for this problem.
    // Output
    // Print exactly:
    // Hello World
    // Answer
    // System.out.println("Hello World");

    // B. Print First 5 Alphabets
    // Your task is to print the first five letters of the English alphabet.
    // Input
    // There is no input for this problem.
    // Output
    // Print the first five uppercase English letters, one per line

    // System.out.println("A");
    // System.out.println("B");
    // System.out.println("C");
    // System.out.println("D");
    // System.out.println("E");

    // C. Triangle
    // Your task is to print a right-angled triangle pattern using asterisks (*).
    // Input
    // There is no input for this problem.
    // Output
    // Print the following pattern exactly as shown:
    // *****
    // ****
    // ***
    // **
    // *

    // System.out.println("*****");
    // System.out.println("****");
    // System.out.println("***");
    // System.out.println("**");
    // System.out.println("*");

    // D. Print Z
    // Your task is to print the letter Z using asterisks (*) as shown below.
    // Input
    // There is no input for this problem.
    // Output
    // Print the following pattern exactly as shown:
    // *****
    //    *
    //   *
    //  *
    // *****

    // System.out.println("*****");
    // System.out.println("   *");
    // System.out.println("  *");
    // System.out.println(" *");
    // System.out.println("*****");

    // E. Print Table of 5
    // Your task is to print the multiplication table of the 5.
    // Input
    // There is no input for this problem.
    // Output
    // Print the table of 5 in the format as shown in the example.

    // System.out.println(5*1);
    // System.out.println(5*2);
    // System.out.println(5*3);
    // System.out.println(5*4);
    // System.out.println(5*5);

    // F. Rectangle
    // You are given the length and breadth of a rectangle. Your task is to calculate its area and perimeter.
    // The formulas are:
    // Area = length × breadth
    // Perimeter = 2×(length+breadth)
    // Input
    // A single line containing two integers length and breadth (1≤length,breadth≤1000).
    // Output
    // You are given the length and breadth of a rectangle. Your task is to calculate its area and perimeter.
    // The formulas are:
    // Area = length × breadth
    // Perimeter = 2×(length+breadth)
    
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter The Lenth, breadth");
    // int length = sc.nextInt();
    // int breadth = sc.nextInt();
    // int area, perimeter;
    // area = length * breadth;
    // perimeter = 2 * (length + breadth);
    // System.out.println("Area = " + area);
    // System.out.println("Perimeter = " + perimeter);

    // G. Print Table of N
    // You are given an integer N, Your task is to print the multiplication table of N from 1 to 10
    // Input
    // A single integer N (1≤N≤100)
    // Output
    // Print the table of N in the format shown in the example below.

    // int n = sc.nextInt();
    // int i = 1;
    // while(i <= 10){
    //     System.out.println(n + " x " + i + " = " + (n*i));
    //     i++;
    // }

    // H1. Calculator
    // You are given two integers N and M . Your task is to compute and print the results of the following operations:

    // N+M
    // N−M
    // N×M
    // N÷M (integer division) NmodM
    // Input
    // A single line containing two integers N and M (1≤N,M≤1000).
    // Output
    // Print five lines in the format as shown in the example.

    // int n = sc.nextInt();
    // int m = sc.nextInt();
    
    // System.out.println(n + " + " + m + " = " + (n+m));
    // System.out.println(n + " - " + m + " = " + (n-m));
    // System.out.println(n + " * " + m + " = " + (n*m));
    // System.out.println(n + " / " + m + " = " + (n/m));
    // System.out.println(n + " % " + m + " = " + (n%m));

    // H2. Calculator - II
    // You are given two integers N and M.
    // Your task is to compute and print the results of the following operations:
    // N+M
    // N−M
    // N×M
    // N÷M (integer division) NmodM
    // Input
    // Two integers N and M, each given on a separate line (1≤N,M≤109).
    // Output
    // Print five results in the following format as shown in the example.

    // int n = sc.nextInt();
    // int m = sc.nextInt();
    
    // System.out.println(n + " + " + m + " = " + (n+m));
    // System.out.println(n + " - " + m + " = " + (n-m));
    // System.out.println(n + " * " + m + " = " + (n*m));
    // System.out.println(n + " / " + m + " = " + (n/m));
    // System.out.println(n + " % " + m + " = " + (n%m));

    // I. Add Last Digits
    // You are given two integers N and M. Your task is to find the sum of the last digits of N and M.
    // Input
    // A single line containing two integers N and M (1≤N,M≤1000).
    // Output
    // Print a single integer — the sum of the last digits of N and M.

    // int n = sc.nextInt();
    // int m = sc.nextInt();

    // n = n%10;
    // m = m%10;
    // System.out.println(n+m);

    // J. Even or Odd
    // You are given an integer N
    // . Your task is to determine whether the number is even or odd.
    // Input
    // A single integer N (1≤N≤109).
    // Output
    // Even if N is even
    // Odd if N is odd

    // int n = sc.nextInt();
    // if(n%2 == 0){
    //     System.out.println("Even");
    // } else {
    //     System.out.println("Odd");
    // }

    // K. Factor
    // You are given two integers N and F. Your task is to check whether F is a factor of N.
    // A number F is said to be a factor of N if N is divisible by F.
    // Input
    // A single line containing two integers N and F (1≤N,F≤109).
    // Output
    // Print:
    // Yes if F is a factor of N
    // No otherwise

    
    // int f = sc.nextInt();
    // int n = sc.nextInt();
    // if(f%n == 0){
    //     System.out.println("Yes");
    // } else {
    //     System.out.println("No");
    // }

    // L. Multiple
    // You are given two integers N and M. Your task is to check whether M is a multiple of N.
    // A number M is said to be a multiple of N if M is divisible by N.
    // Input
    // A single line containing two integers N and M (1≤N,M≤109).
    // Output
    // Print:
    // Yes if M is a multiple of N
    // No otherwise

    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // if(m%n == 0){
    //     System.out.println("Yes");
    // } else {
    //     System.out.println("No");
    // }

    // M. Pass or Fail
    // You are given the marks obtained by a student. Your task is to check whether the student has passed or failed.
    // A student is considered to have passed if the marks obtained are at least 35.
    // Input
    // A single integer marks (0≤marks≤100).
    // Output
    // Print:
    // Pass if the student has passed
    // Fail otherwise

    // int marks = sc.nextInt();
    // if(marks >= 35){
    //     System.out.println("Pass");
    // }else {
    //     System.out.println("Fail");
    // }


    // N. Max and Min of 2 Numbers
    // You are given two integers A and B. Your task is to find the minimum and maximum among them.
    // Input
    // A single line containing two integers A and B (1≤A,B≤109).
    // Output
    // Print two lines:
    // Min = X
    // Max = Y
    // where X is the minimum value and Y is the maximum value.

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // if(b<a){
    //     System.out.println("Min = " + b);
    //     System.out.println("Max = " + a);
    // }else {
    //     System.out.println("Min = " + a);
    //     System.out.println("Max = " + b);
    // }

    // O. Max and Min of 3 Numbers
    // You are given three integers A, B, and C. Your task is to find the minimum and maximum among them.
    // Input
    // A single line containing three integers A, B, and C (1≤A,B,C≤109).
    // Output
    // Print two lines:
    // Min = X
    // Max = Y
    // where X is the minimum value and Y is the maximum value.

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // if(a>=b && a>=c){
    //     if(b>c){
    //         System.out.println("Min = " + c);
    //     }else {
    //         System.out.println("Min = " + b);
    //     }
    //     System.out.println("Max = " + a);
    // }else if (b>=a && b>=c) {
    //     if(a>c){
    //         System.out.println("Min = " + c);
    //     }else {
    //         System.out.println("Min = " + a);
    //     }
    //     System.out.println("Max = " + b);
    // }else {
    //     if(a>b){
    //         System.out.println("Min = " + b);
    //     }else {
    //         System.out.println("Min = " + a);
    //     }
    //     System.out.println("Max = " + c);
    // }


    // P. Student Performance Evaluation
    // You are given the marks obtained by a student. Based on the marks, display an appropriate performance message according to the following rules:

    // If marks are greater than 90, print Excellent
    // Else if marks are greater than 80 and less than or equal to 90, print Good
    // Else if marks are greater than 70 and less than or equal to 80, print Fair
    // Else if marks are greater than 60 and less than or equal to 70, print Meets Expectations
    // Else (marks less than or equal to 60), print Below Par
    // Input
    // A single integer marks (0≤marks≤100).
    // Output
    // Print a single line containing the performance message corresponding to the given marks.

    // int marks = sc.nextInt();
    // if(marks > 90){
    //     System.out.println("Excellent");
    // }
    // else if(marks > 80 && marks <= 90){
    //     System.out.println("Good");
    // }
    // else if(marks > 70 && marks <= 80){
    //     System.out.println("Fair");
    // }
    // else if(marks > 60 && marks <= 70){
    //     System.out.println("Meets Expectations");
    // }
    // else {
    //     System.out.println("Below Par");
    // }

    // Q. Find the location point
    // You are given the coordinates of a point (X,Y) on a Cartesian plane. 
    // Your task is to determine the location of the point.
    // The possible locations are:
    // Origin — if X=0 and Y=0 (x=0 && y=0)
    // X axis — if Y=0 and X≠0 (y=0 && x!=0)
    // Y axis — if X=0 and Y≠0 (x=0 && y!=0)
    // 1st Quadrant — if X>0 and Y>0 (x>0 && y>0)
    // 2nd Quadrant — if X<0 and Y>0 (x<0 && y>0)
    // 3rd Quadrant — if X<0 and Y<0 (x<0 && y<0)
    // 4th Quadrant — if X>0 and Y<0 (x>0 && y<0)
    // Input
    // A single line containing two integers X and Y (−109≤X,Y≤109).
    // Output
    // Print a single line indicating the location of the point.
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (x == 0 && y == 0) {
        System.out.println("Origin");
    }
    else if (y == 0 && x != 0) {
        System.out.println("X axis");
    }
    else if (x==0 && y!=0) {
        System.out.println("Y axis");
    }
    else if (x>0 && y>0) {
        System.out.println("1th Quadrant");
    }
    else if (x<0 && y>0) {
        System.out.println("2th Quadrant");
    }
    else if (x<0 && y<0) {
        System.out.println("3th Quadrant");
    }
    else {
        System.out.println("4th Quadrant");
    }

    }
}
