public class loops {
    public static void main(String[] args){
        // Loops can execute a block of code as long as a specified condition is true.
        // Loops are handy because they save time, reduce errors, and they make code more readable.

        // for loop structure
        // Syntax
        // for (statement 1; statement 2; statement 3) {
        //     // code block to be executed
        // }
        // Statement 1 is executed (one time) before the execution of the code block.
        // Statement 2 defines the condition for executing the code block.
        // Statement 3 is executed (every time) after the code block has been executed.

        // Print Numbers
        // The example below will print the numbers 0 to 4:
        // Example
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i);
        // }

        // Print Even Numbers
        // This example prints even values between 0 and 10:
        // Example
        // for (int i = 0; i <= 10; i = i + 2) {
        // System.out.println(i);
        // }

        // Countdown
        // This example prints a countdown from 5 to 1:
        // Example
        // for (int i = 5; i > 0; i--) {
        // System.out.println(i);
        // }

        // While Loop
        // The while loop repeats a block of code as long as the specified condition is true:
        // Note: Do not forget to increase the variable used in the condition (i++), otherwise the loop will never end!.

        // Do you wonder why we used the letter i in the example above? It's a counter variable and a common choice in simple loops because it's short, traditional, and stands for 'index' or 'iterator'.

        // Syntax
        // while (condition) {
        // // code block to be executed
        // }

        // Print Numbers
        // The example below will print the numbers 0 to 4:
        // Example
        // int i = 0;
        // while (i < 5) {
        // System.out.println(i);
        // i++;
        // }
        // the code in the loop will run again and again, as long as a variable (i) is less than 5.

        // Countdown Example
        // You can also use a while loop to count down. This example counts from 3 to 1, and then prints "Happy New Year!!" at the end:
        // Example
        // int countdown = 3;
        // while (countdown > 0) {
        // System.out.println(countdown);
        // countdown--;
        // }
        // System.out.println("Happy New Year!!");


        // The Do/While Loop
        // The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. Then it will repeat the loop as long as the condition is true.
        // Syntax
        // do {
        // // code block to be executed
        // }
        // while (condition);
        // Note: The semicolon ; after the while condition is required!

        // Print Numbers
        // The example below will print the numbers 0 to 4:
        // Example
        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // }
        // while (i < 5);

        // Summary: A do/while loop always runs at least once, even if the condition is false at the start. This is the key difference from a while loop, which would skip the code block completely in the same situation.

        // This behavior makes do/while useful when you want something to happen at least once, such as showing a message or asking the user for input.

        // Nested Loops
        // It is also possible to place a loop inside another loop. This is called a nested loop.
        // The "inner loop" will be executed one time for each iteration of the "outer loop":

        // Example
        // // Outer loop
        // for (int i = 1; i <= 2; i++) {
        // System.out.println("Outer: " + i); // Executes 2 times
        
        // // Inner loop
        // for (int j = 1; j <= 3; j++) {
        //     System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
        // }
        // }

        // Multiplication Table Example
        // This example uses nested loops to print a simple multiplication table (1 to 3):

        // Example
        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= 3; j++) {
        //     System.out.print(i * j + " ");
        // }
        // System.out.println();
        // }




        // The for-each Loop
        // There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data structures):
        // Syntax
        // for (type variableName : arrayName) {
        // // code block to be executed
        // }
        // The for-each loop is simpler and more readable than a regular for loop, since you don't need a counter (like i < array.length).

        // The following example prints all elements in the cars array:
        // Example
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // for (String car : cars) {
        // System.out.println(car);
        // }
        // // Example
        // int[] numbers = {10, 20, 30, 40};

        // for (int num : numbers) {
        // System.out.println(num);
        // }
    }
}