### Methods
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.

## Syntax
returnType methodName(parameters) {
    // code
}

## Create a Method
A method must be declared within a class.
It is defined with the name of the method, followed by parentheses ().
Java provides some pre-defined methods, such as System.out.println(),
but you can also create your own methods to perform certain actions:

## Example
Create a method inside Main:

public class Main {
  static void myMethod() {
    // code to be executed
  }
}


## Example Explained
myMethod() is the name of the method
static means that the method belongs to the Main class and not an object of the Main class.
void means that this method does not have a return value.


## Call a Method
To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
In the following example, myMethod() is used to print a text (the action), when it is called:

Example
Inside main, call the myMethod() method:

public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    // A method can also be called multiple times:
    myMethod();
    myMethod();
    myMethod();
  }
}

// Outputs "I just got executed!"
// Outputs "I just got executed!"
// Outputs "I just got executed!"
// Outputs "I just got executed!"


## problems
# 1 Create a Welcome Message
public class Main {
  static void welcomeMessage() {
    System.out.println("Welcome to Java!");
  }

  public static void main(String[] args) {
    welcomeMessage();
  }
}



### Method Parameters

## Parameters and Arguments
Information can be passed to methods as a parameter. Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses.
You can add as many parameters as you want, just separate them with a comma.

The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:

public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes

## note
When a parameter is passed to the method, it is called an argument.
So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.

## Multiple Parameters
Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.


### Java Return

## Return Values
In the previous page, we used the void keyword in all examples (like static void myMethod(int x)), which indicates that the method should not return a value.

If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:

Example
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
// Outputs 8 (5 + 3)


Practical Example
Here is a simple and fun "game example" using a method that returns a value, to show the double of the numbers 1 through 5 (using a for loop):

Example
public class Main {
  // Method that doubles the number
  static int doubleGame(int x) {
    return x * 2;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Double of " + i + " is " + doubleGame(i));
    }
  }
}



### Method Overloading
Same method name, different parameters.

static int add(int a, int b){
    return a+b;
}

static double add(double a,double b){
    return a+b;
}

### Pass by Value
Java always passes arguments by value.

static void change(int x){
    x = 100;
}

public static void main(String[] args){
    int a = 10;
    change(a);
    System.out.println(a);
}

Output
10
The original variable doesn't change because a copy of its value is passed.



## Practice Problems
# 1 Write a method that returns the square of a number.
# 2 Write a method that returns the larger of two numbers.
# 3 Write a method that checks if a number is even.