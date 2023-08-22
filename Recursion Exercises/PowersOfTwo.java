import java.util.Scanner;

class PowersOfTwo{
    public static void main(String[] args) {
        System.out.println(calculate(0));
    }
    public static int calculate(int n){ 
        // The method calculates only n >= 0
        if (n==0)
            return 1;
        else {
            return 2 * calculate((n-1));
        }
    }
}