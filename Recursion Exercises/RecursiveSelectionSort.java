public class RecursiveSelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 621, 12, 5, 0, 56};
        sort(list);
    }
    public static void sort(double[] list) {
        sort(list, 0, list.length - 1);
        for (double k : list){
            System.out.println(k);
        }
    }
    public static void sort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];
            for (int i = low+1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }
            list[indexOfMin] = list[low];
            list[low] = min;
            sort(list, low+1, high);
        }
    }
}
