import java.util.*;
public class week1Problems {
    public static void main(String[] args) {
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
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Lenth, breadth");
    int length = sc.nextInt();
    int breadth = sc.nextInt();
    int area, perimeter;
    area = length * breadth;
    perimeter = 2 * (length + breadth);
    System.out.println("Area = " + area);
    System.out.println("Perimeter = " + perimeter);

    }
}
