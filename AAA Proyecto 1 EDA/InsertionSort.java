/*Autor: Guzman Ramirez Cesar
 * Ultima Fecha de modificacion: 18 de marzo de 2023
 * 
 * 
 * Proposito:
 * El prososito de este algortimo (insertionsort) es modidifcar el dado durante las practicas para poder 
 * analizar un analisis de complejidad mediante la contabilizacion de las operaciones basicas.
 */


// Codigo modificado con las instrucciones para calcular las operaciones dadas:
public class InsertionSort {
    public static int sort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                swaps++;
            }
            arr[j + 1] = key;
        }
        return swaps;
    }
}

