/* (Compute e) You can approximate e using the following summation:
https://ibb.co/T8tDz4C
 */
public class Exercise_5_26 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 0; i <= 1000; i++) {
            result += (1 / factorial(i));
        }
        System.out.println(result);
    }

    static double factorial(double f) {
        if (f == 0) {
            return 1;
        } else {
            return f * factorial(f - 1);
        }
    }
}

