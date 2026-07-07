import java.util.Scanner;
public class basicSolutions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1 Right Half Pyramid
        // int n = sc.nextInt();
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 2 Inverted Right Half Pyramid
        // int n = sc.nextInt();
        // for(int i = n; i >= 1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 3 Inverted Left Half Pyramid
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = i; j > 1; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = sc.nextInt();
        // for(int i = n; i > 1; i--){
        //     for(int j = i; j > 1; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j < i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 4 Left Half Pyramid
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // Right Half
        // int n = sc.nextInt();
		// for(int i = 1; i <= n; i++){
		//     for(int j = 1; j <= i; j++){
		//         System.out.print("* ");
		//     }
		//     System.out.println();
		// }
		
        // // Invderted Right Half
        // int n = sc.nextInt();
		// for(int i = n; i >= 1; i--){
		//     for(int j = 1; j <= i; j++){
		//         System.out.print("* ");
		//     }
		//     System.out.println();
		// }

        // // Left Half Pyramid
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Inverted Left Half Pyramid
        // int n = sc.nextInt();
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // full pyramid
		// int n = sc.nextInt();
		// for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
		//     // for(int j = n - i; j >= 1; j--){
		//     //     System.out.print(" ");
		//     // }
		//     for(int j = 1; j <= i; j++){
		//         System.out.print(" *");
		//     }

		//     System.out.println();
		// }


        // // Inverted Full Pyramid
        // int n = sc.nextInt();
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<= i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // // Half Diamond Star
        // int n = sc.nextInt();
		// for(int i = 1; i <= n; i++){
		//     for(int j = 1; j <= i; j++){
		//         System.out.print("* ");
		//     }
		//     System.out.println();
		// }
		// for(int i = n; i >= 1; i--){
		//     for(int j = 1; j <= i; j++){
		//         System.out.print("* ");
		//     }
		//     System.out.println();
		// }


        // // Diamond Shape
        // int n = sc.nextInt();
		// for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
		//     // for(int j = n - i; j >= 1; j--){
		//     //     System.out.print(" ");
		//     // }
		//     for(int j = 1; j <= i; j++){
		//         System.out.print(" *");
		//     }
		//     System.out.println();
		// }
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<= i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }


        // // Alphabet “A” using Stars
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     // Inner for loop for logic execution
        //     for (int j = 0; j <= n / 2; j++) {
        //         // // prints two column lines
        //         if (i==0 || j==0 || j==n/2 || i==n/2) {
        //             if(i==0  && (j==0 || j==n/2))
        //                 System.out.print(" ");
        //             else
        //                 System.out.print("*");
        //         }
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        // // Hollow Square
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n ; j++) {
        //         if(i == 1 | i == n | j == 1 | j == n){
        //              System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // // Stair Case Patterns
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     int k = (i % 2 != 0) ? i + 1 : i;
        //     for (int j = 1; j <= k ; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    }
}