import java.util.*;
public class functionsMethod {
    //sum of two numbers using function
    public static int sumTwo(int a,b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sumTwo(a, b);
        System.out.println("Sum = "+result);
        sc.close();
    }
}