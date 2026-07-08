import java.util.Scanner;
public class methods {
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    static void welcomeMessage(String name) {
        System.out.println("Welcome to Java " + name);
    }
    static int squareNum(int x) {
        return x * x;
    }
    static int largeNum(int x, int y) {
        if(x > y){
            return x;
        }
        else {
            return y;
        }
    }
    static void isEven(int num) {
        if(num % 2 == 0){
            System.out.println("Number is Even " + num );
        }
        else {
            System.out.println("Number is not Even " + num );
        }
    }
    static void change(int x){
        x = 100;
    }
    static void change1(int x){
        System.out.println("Before changing inside change1 fn: " + x);
        x = 100;
        System.out.println("After changing inside change1 fn: " + x);
    }
    public static void main(String[] args){
        myMethod();
        welcomeMessage("Suleiman");
        // the square of a number
        int square = squareNum(4);
        System.out.println(square);
        // larger of two numbers
        int ans = largeNum(6, 9);
        System.out.println("Larger number is " + ans);
        // checks if a number is even
        isEven(10); // Even
        isEven(11); // Odd
        // call by value
        // Code here CANNOT use a
        int a = 10;
        change(a);
        // Code here CAN use a
        System.out.println(a);

        // // Code here CANNOT use b
        int b = 2;
        // Code here CAN use b
        System.out.println("Before changing inside main: " + b);
        change1(b);
        System.out.println("After changing inside main: " + b);
    }
}