import java.util.Arrays;

public class MergeSort {
    public static int sort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;
        if (n > 1) {
            // Dividir el array en dos mitades
            int mid = n / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);

            // Ordenar las dos mitades
            comparisons += sort(left);
            comparisons += sort(right);

            // Mezclar las dos mitades ordenadas
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
                comparisons++;
            }
            while (i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        return comparisons;
    }
}
