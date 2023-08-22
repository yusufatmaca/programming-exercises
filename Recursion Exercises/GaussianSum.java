public class GaussianSum {
    public static void main(String[] args) {
        System.out.println(calculate(5));
    }
    public static int calculate(int n){
        if (n == 1){
            return 1;
        }
        else {
            return n + calculate(n-1);
        }
    }
}
