## Level 1 (Very Easy) - Solution

1. Print "Hello, World!"

System.out.println("Hello, World!");

2. Print your name and age.

System.out.println("My name is Suleiman and age is 28y/o");

3. Add two numbers.

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println(a + b);


4. Swap two numbers using a third variable.

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Before Swap A =" + a +" and " + "B =" +b);
int temp=a;
a=b;
b=temp;
System.out.println("After Swap A =" + a + " and " + "B =" + b);

5. Swap two numbers without using a third variable.
hint - use (addition+subs), (multiplication+division), (bitwise)

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Before swapping:");
System.out.println("a = " + a + ", b = " + b);

a = a + b; // 3 + 5 = 8
b = a - b; // 8 - 5 = 3
a = a - b; // 8 - 3 = 5

System.out.println("After swapping:");
System.out.println("a = " + a + ", b = " + b);

6. Find the square of a number.

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println("square of a number = " + (a * a));

7. Find the cube of a number.

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println("square of a number = " + (a * a * a));

8. Convert Celsius to Fahrenheit.

Scanner sc = new Scanner(System.in);
int c = sc.nextInt();
int f = c * 9 / 5 + 32;
System.out.println(f);

9. Convert Fahrenheit to Celsius.

Scanner sc = new Scanner(System.in);
int f = sc.nextInt();
int c = (f - 32) * 5 / 9;
System.out.println(c);

10. Find the area and perimeter of a rectangle.

Scanner sc = new Scanner(System.in);
int length = sc.nextInt();
int width = sc.nextInt();

int area = length * width;
int perimeter = 2 * (length + width);

System.out.println("Area = " + area);
System.out.println("Perimeter = " + perimeter);




## Level 2 (Easy) - Solution 


1. Check whether a number is even or odd.

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n%2 == 0){
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

2. Find the largest of two numbers.


Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();

if(n < m){
    System.out.println("M is the Largest " + m);
} else {
    System.out.println("N is the Largest " + n);    
}


3. Find the smallest of two numbers.

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();

if(n < m){
    System.out.println("N is the Smallest number " + n);
} else {
    System.out.println("M is the Smallest number " + m);    
}


4. Find the average of three numbers.

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int p = sc.nextInt();

int ave = (n + m + p)/3;

System.out.println("Average of three numbers " + ave);


5. Find the remainder of two numbers.

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();


System.out.println("Remainder of two numbers " + n%m);

6. Calculate Simple Interest.

Scanner sc = new Scanner(System.in);
int p = sc.nextInt();
int r = sc.nextInt();
int t = sc.nextInt();

int si = (p+r+t) / 100;

System.out.println("Simple Interest is " + si);

8. Convert seconds into hours, minutes, and seconds.

Scanner sc = new Scanner(System.in);
int sec = sc.nextInt();

int hr = sec / 3600; // after hour you need to store the remaining then use it
int rem = sec % 3600; 

int mn = rem / 60;
int s = rem % 60;

System.out.println("Hour " + hr);
System.out.println("Minute " + mn);
System.out.println("Second " + s);
