/*  Using nested loops that display the asterisks pattern.
I only wrote the code for Pattern D.
Question: https://ibb.co/yNh5fSz
*/

import java.util.Scanner;
public class Exercise518 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scan.nextInt();


        for (int i = number; i >= 1; i--) {
            for (int k = 1; k <= (number - i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}

