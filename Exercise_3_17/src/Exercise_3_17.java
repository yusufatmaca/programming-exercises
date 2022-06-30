/* Simple rock-scissors-paper game using for loop.
Question: https://ibb.co/Ycywghp
 */

import java.util.Random;
import java.util.Scanner;

public class Exercise_3_17 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int system = random.nextInt(2);
        String[] game = {"Rock", "Scissors", "Paper"};
        System.out.println("Rock: 0, Scissors: 1, Paper: 2");
        int choice = scan.nextInt();
        if (choice == 0) {
            if (system == 0) System.out.println("no winner! System selected " + game[system]);
            else if (system == 1) System.out.println("you won!  System selected " + game[system]);
            else if (system == 2) System.out.println("system won! System selected " + game[system]);
        } else if (choice == 1) {
            if (system == 0) System.out.println("system won!  System selected " + game[system]);
            else if (system == 1) System.out.println("no winner!  System selected " + game[system]);
            else if (system == 2) System.out.println("you won!  System selected " + game[system]);
        } else if (choice == 2) {
            if (system == 0) System.out.println("you won!  System selected " + game[system]);
            else if (system == 1) System.out.println("system won!  System selected " + game[system]);
            else if (system == 2) System.out.println("no winner!  System selected " + game[system]);
        }

    }
}
