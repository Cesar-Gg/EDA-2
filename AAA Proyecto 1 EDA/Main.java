import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = { 50, 100, 500, 800, 1000, 2000, 5000, 10000 };
        Random rand = new Random();
        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(1000); // Números aleatorios entre 0 y 999
            }
            System.out.println("Array de " + size + " elementos:");
            System.out.println();

            // Ordenamiento por selección
            int[] arrSelection = Arrays.copyOf(arr, arr.length);
            long startTime = System.nanoTime();
            int comparisons = SelectionSort.sort(arrSelection);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);

            System.out.println("Ordenamiento por selección:");
            System.out.println("Comparaciones: " + comparisons);
            System.out.println("Tiempo (ns): " + duration);
            System.out.println("Operaciones totales: " + (comparisons));

            // Ordenamiento por inserción
            int[] arrInsertion = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            int swaps = InsertionSort.sort(arrInsertion);
            endTime = System.nanoTime();
            duration = (endTime - startTime);

            System.out.println("Ordenamiento por inserción:");
            System.out.println("Intercambios: " + swaps);
            System.out.println("Tiempo (ns): " + duration);
            System.out.println("Operaciones totales: " + (swaps));

            // Ordenamiento por mezcla
            int[] arrMerge = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            int comparisonsMerge = MergeSort.sort(arrMerge);
            endTime = System.nanoTime();
            duration = (endTime - startTime);

            System.out.println("Ordenamiento por mezcla:");
            System.out.println("Comparaciones: " + comparisonsMerge);
            System.out.println("Tiempo (ns): " + duration);
            System.out.println("Operaciones totales: " + (comparisonsMerge));

            // Ordenamiento de burbuja
            int[] arrBubble = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            int passes = BubbleSort.sort(arrBubble);
            endTime = System.nanoTime();
            duration = (endTime - startTime);

            System.out.println("Ordenamiento por burbuja:");
            System.out.println("Pases: " + passes);
            System.out.println("Tiempo (ns): " + duration);
            System.out.println("Operaciones totales: " + (passes * size));

            // Ordenamiento por montón
            int[] arrHeap = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            int comparisonsHeap = HeapSort.sort(arrHeap);
            endTime = System.nanoTime();
            duration = (endTime - startTime);

            System.out.println("Ordenamiento por montón:");
            System.out.println("Comparaciones: " + comparisonsHeap);
            System.out.println("Tiempo (ns): " + duration);
            System.out.println("Operaciones totales: " + (comparisonsHeap));

            System.out.println("======================================");
            System.out.println();
        }
    }
}
