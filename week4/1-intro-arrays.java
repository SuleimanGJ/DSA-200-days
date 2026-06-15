public class 1-intro-arrays {
    public static void main(String[] args){
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // cars[0] = "Opel";
        // System.out.println(cars[0]);
        // // Now outputs Opel instead of Volvo

        // // Using the new Keyword
        // String[] cars = new String[4]; // size is 4

        // cars[0] = "Volvo";
        // cars[1] = "BMW";
        // cars[2] = "Ford";
        // cars[3] = "Mazda";

        // System.out.println(cars[0]); // Outputs Volvo
        // // With new
        // String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};

        // // Shortcut (most common)
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};


        // Note: You cannot write new String[4] {"Volvo", "BMW", "Ford", "Mazda"}.
        // In Java, when using new, you either:
        // Use new String[4] to create an empty array with 4 slots, and then fill them later
        // Or use new String[] {"Volvo", "BMW", "Ford", "Mazda"} (without specifying the number of elements) to create the array and assign values at the same time



        // Loop Through an Array


        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // for (int i = 0; i < cars.length; i++) {
        // System.out.println(cars[i]);
        // }


        // Example - Calculate the Sum of Elements
        // int[] numbers = {1, 5, 10, 25};
        // int sum = 0;

        // // Loop through the array and add each element to sum
        // for (int i = 0; i < numbers.length; i++) {
        // sum += numbers[i];
        // }

        // System.out.println("The sum is: " + sum);





        // Loop Through an Array with For-Each

        // Syntax
        // for (type variable : arrayname) {  
        // // code block to be executed
        // }
        // The colon (:) is read as "in". So you can read the loop as: "for each variable in array".


        // Example
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // for (String car : cars) {
        // System.out.println(car);
        // }

        // Problems 1
        // create a program that calculates the average of different ages

        // // An array storing different ages
        // int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // float avg, sum = 0;

        // // Get the length of the array
        // int length = ages.length;

        // // Loop through the elements of the array
        // for (int age : ages) {
        // sum += age;
        // }

        // // Calculate the average by dividing the sum by the length
        // avg = sum / length;

        // // Print the average
        // System.out.println("The average age is: " + avg);

        // Problem 2
        // Create a program that keeps track of the highest and lowest values in an array

        // int[] numbers = {45, 12, 98, 33, 27}

        // int max = numbers[0];
        // int min = numbers[0];

        // for(int n : numbers){
        //     if(n < max){
        //         max = n;
        //     } 
        //     if (n < min) {
        //         min = n;
        //     }
        // }
        // System.out.println("Max: " + max);
        // System.out.println("Min: " + min);  

    }
}