class Fibonacci {
    public static void main(String[] args) {
        System.out.println(calculate(11));
    }
    public static int calculate(int n){
        if (n == 0) { // Base Case
            return 0;
        }
        else if (n == 1) { // Base Case
            return 1;
        }
        else { // Recursive Calls
            return (calculate(n-1) + calculate(n-2)); // Reduction
        }
    }
}