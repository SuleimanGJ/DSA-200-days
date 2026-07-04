### Solutions - Level 4

1. Print numbers from 1 to N.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++){
        System.out.println(i);
    }

2. Print numbers from N to 1.

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = n; i <= 1; i--){
        System.out.println(i);
    }

3. Print all even numbers up to N.

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i <= n; i = i + 2) {
    System.out.println(i);
    }

4. Print all odd numbers up to N.

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i <= n; i = i + 1) {
    System.out.println(i);
    }

5. Find the sum of the first N natural numbers.
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<0){
        System.out.println(0)
    }
    long sum = 0;
    int i = 1;
    while(i <= n){
        sum+=i;
        i++;
    }
    System.out.println(sum);

6. Calculate the factorial of a number.

7. Print a multiplication table.

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    while(i <= n){
        System.out.println(n + " x " + i + " = " + (n*i));
        i++;
    }

8. Reverse a number.

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n != 0){
        System.out.println(n%10);
        n/=10;
    }

9. Count the digits in a number.

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int counter = 0;
    while(n != 0){
        System.out.println(n%10);
        n/=10;
        counter++;
    }
    System.out.println(counter);

10. Find the sum of digits of a number.

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    while(n != 0){
        sum += n%10;
        n = n / 10;
    }
    System.out.println(sum);
