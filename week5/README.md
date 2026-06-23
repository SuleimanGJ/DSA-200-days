# 🧱 Java Basics
---

### 🔹 `JavaBasics.java`  
> **🧾 Problem:** A simple intro program that demonstrates variable declaration, arithmetic, user input, and output in Java.  
> **📚 Concepts Used:**  
- Variables and Data Types  
- Arithmetic Operators  
- `Scanner` Class for Input  
- `System.out.println()` for Output  

---

> **🧠 Intuition:**  
This is your first friendly handshake with Java 🤝  
You're declaring variables, adding two numbers (`a + b`), and printing the result.  
Then you ask the user for their name and say it back — just like a polite robot 🤖

---

> **⚙️ Breakdown:**  
1. Declare and initialize two integers `a` and `b`  
2. Calculate their sum and print it  
3. Use `Scanner` to read a full line (like a name or sentence) from the user  
4. Print the user input  
5. Don’t forget to `close()` your Scanner — Java’s version of “thanks for the chat!” 🫡

---


---

### 🔹 `table.java`

> **📌 Goal:**  
Print the **multiplication table** of any number entered by the user (from 1 to 10).  
> **📚 Concepts Used:** Loops, User Input, Arithmetic

---

> **🧠 Intuition:**  
Remember school days when you had to recite tables in front of the teacher like:  
“5 ones are 5, 5 twos are 10…” 😅  
Well, Java can do that for you now. It won’t judge, won’t laugh — just pure calculations 🔢

---

> **⚙️ Approach:**  
1. Take user input using `Scanner`  
2. Run a loop from 1 to 10  
3. Multiply input number with the loop counter  
4. Print the formatted result like: `n * i = n*i`

---



# Variables & Data Types in Java

This folder contains Java source code and notes related to the fundamental concepts of **variables** and **data types** in Java.

## Contents

- **Variable Declaration and Initialization:**  
  Learn how to declare variables, assign values, and understand variable scope.

- **Primitive Data Types:**  
  Explore Java's built-in data types such as `int`, `float`, `double`, `char`, `boolean`, `byte`, `short`, and `long`.

- **Reference Data Types:**  
  Understand objects, arrays, and how reference types differ from primitives.

- **Type Conversion and Casting:**  
  Examples of implicit and explicit type conversion in Java.

- **Best Practices:**  
  Tips for naming variables, choosing appropriate data types, and writing readable code.

## How to Use

1. Open the Java files in this folder to review code examples and explanations.
2. Compile and run the code using your preferred Java IDE or the command line to see how variables and data types work in practice.

## Additional Resources

- [Official Java Documentation - Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Java Variables (W3Schools)](https://www.w3schools.com/java/java_variables.asp)



## How to Run Java code

1. Compile the program:
   ```
   javac fileName.java
   ```
2. Run the program:
   ```
   java fileName
   ```


---



## Assignments

# 1 Circle Area Calculator

This Java program calculates the area of a circle based on user input for the radius.

## How It Works

- The program prompts the user to enter the radius of a circle.
- It reads the radius as an integer from the console.
- It calculates the area using the formula:  
  `area = 3.14 × radius × radius`
- The calculated area is displayed to the user.

## Example

```
Enter radius of circle:
5
Area of circle is: 78.5
```

---





# 2 Stationery Bill Calculator

This Java program calculates the total cost of purchasing a pencil, pen, and eraser based on user input.

## How It Works

- The program prompts the user to enter the cost of a pencil, pen, and eraser (in that order).
- It reads the three costs as floating-point numbers.
- It calculates the total cost by summing the three values.
- The total cost is then displayed to the user.

## Example

```
Enter the cost of pencil, pen, and eraser respectively:
5.5
10
3.25
Total cost: 18.75
```

---


## Type Casting
Type casting means converting one data type into another. For example, turning an int into a double.

In Java, there are two main types of casting:

## Widening Casting (automatic) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

## Narrowing Casting (manual) - converting a larger type to a smaller type size
double -> float -> long -> int -> char -> short -> byte

Widening Casting
Widening casting is done automatically when passing a smaller size type into a larger size type.

This works because there is no risk of losing information. For example, an int value can safely fit inside a double:


# 💥 Introduction to Java Operators 💥


### Code Explanation:
The code is structured into sections, each demonstrating a type of operator:
1.  **Arithmetic:** `+`, `-`, `*`, `/`, `%` perform standard mathematical calculations.
2.  **Unary:** `++`, `--` (increment/decrement), `+`, `-` (sign), `!` (logical NOT). Shows pre/post effects.
3.  **Relational:** `==`, `!=`, `>`, `<`, `>=`, `<=` for comparisons, returning boolean.
4.  **Logical:** `&&` (AND), `||` (OR), `!` (NOT) for combining boolean expressions.
5.  **Bitwise:** `&`, `|`, `^`, `~`, `<<`, `>>` operate directly on binary representations of numbers.
6.  **Assignment:** `+=`, `-=`, `*=` etc. for shorthand assignment operations.
7.  **Ternary:** `? :` (conditional operator) for concise `if-else` expressions.
8.  **`instanceof`:** Checks if an object is an instance of a particular class or interface.
This provides a **comprehensive overview** of Java's operator toolkit.





# 💥 Operators - `operator`: Basic Multiplication 💥

## 🎯 Problem Statement
Read two integers from the user and print their product.

**LeetCode Link:** Not applicable (basic arithmetic operation).

## 🤔 Intuition
Multiplication is a fundamental arithmetic operation. Inputting two numbers and applying the `*` operator directly yields their product. This is like **Jarvis quickly calculating component quantities** based on a formula.

## 🛠️ Approach
* Use `Scanner` to read two integers (`a` and `b`).
* Multiply `a` and `b`, storing the result in `product`.
* Print `product`.
* Close the `Scanner`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` - Constant time operations (input, multiplication, output).
* **Space:** `O(1)` - Only a few primitive variables.

### Code Explanation:
The `Scanner` takes `a` and `b` as input. The `*` (multiplication) operator computes `a * b`. The `System.out.println()` statement then displays the calculated `product`.