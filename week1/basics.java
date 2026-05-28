import java.util.*;
public class basics {
    public static void main(String[] args){
        // Java Variables
        // Variables are containers for storing data values.
        // basic syntax
        // type variableName = value;

        // String name = "John";
        // System.out.println(name);

        // int myNum = 15;
        // System.out.println(myNum);

        // int myNum;
        // myNum = 15;
        // System.out.println(myNum);

        // int myNum = 15;
        // myNum = 20;  // myNum is now 20
        // System.out.println(myNum);

        // int myNum = 5;
        // float myFloatNum = 5.99f;
        // char myLetter = 'D';
        // boolean myBool = true;
        // String myText = "Hello";

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // // Print variables
        // System.out.println("Student name: " + studentName);
        // System.out.println("Student id: " + studentID);
        // System.out.println("Student age: " + studentAge);
        // System.out.println("Student fee: " + studentFee);
        // System.out.println("Student grade: " + studentGrade);

        // Create integer variables
        // int length = 4;
        // int width = 6;
        // int area;

        // Calculate the area of a rectangle
        // area = length * width;

        // Print variables
        // System.out.println("Length is: " + length);
        // System.out.println("Width is: " + width);
        // System.out.println("Area of the rectangle is: " + area);
	
        // Taking Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Lenth");
        int length = sc.nextInt();
        System.out.println("Enter The Width");
        int width = sc.nextInt();
        int area;
        area = length * width;
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);


    }
}
