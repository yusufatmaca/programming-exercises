public class XToN {
    public static void main(String[] args) {
        System.out.println(calculate(0.5, 2));
    }
    public static double calculate(double x, int n){
        if (n == 0){
            return 1;
        }
            return x * calculate(x, (n-1));
    }
}
