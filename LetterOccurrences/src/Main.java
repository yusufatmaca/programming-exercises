public class Main {
    public static void main(String[] args) {
        char[] alphabet = createAlphabet();
        displayAlphabet(alphabet);
        countOccurrences(alphabet);
    }

    static char[] createAlphabet() {
        char[] chars = new char[10];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
        }
        return chars;
    }

    static void displayAlphabet(char[] a) {
        for (int k = 0; k < a.length; k++) {
            if ((k + 1) % 20 == 0)
                System.out.println(a[k]);
            else
                System.out.print(a[k] + " ");
        }
    }

    static void countOccurrences(char[] a) {
        int[] ourAlphabet = new int[26];
        for (int i = 0; i < a.length; i++)
            ourAlphabet[a[i] - 'a']++;

        for (int k = 0; k < ourAlphabet.length; k++) {
            if (ourAlphabet[k] == 0) {
                continue;
            } else {
                if ((k + 1) % 10 == 0) {
                    System.out.println("There exist " + ourAlphabet[k] + " times " + (char) (k + 97) + " in our Array.");
                } else {
                    System.out.print("There exist " + ourAlphabet[k] + " times " + (char) (k + 97) + " in our Array." + " ");
                }
            }
        }
    }
}