// Question: https://ibb.co/n8fsFG7

public class Main {
    public static void main(String[] args) {
        boolean[] locker = new boolean[100];

        for (int j = 0; j < locker.length; j++) {
            for (int m = 0; m < locker.length; m++) {
                if ((m + 1) % (j + 1) == 0)
                    locker[m] = !locker[m];
            }
        }
        for (int m = 0; m < locker.length; m++) {
            if (locker[m] == true)
                System.out.println("L" + (m + 1) + " is open.");
        }
    }
}
