public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] series = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};
        System.out.println(recursiveBinarySearch(series, 22));
    }
    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, low, high, key);

    }
    public static int recursiveBinarySearch(int[] list, int low, int high, int key) {
        if (low > high) 
            return -1;
        int mid = (high + low) / 2;
        if (key == list[mid])
            return mid;
        else if (key < list[mid])
            return recursiveBinarySearch(list, low, mid - 1, key);
        else 
            return recursiveBinarySearch(list, mid + 1, high, key);
    }
}
