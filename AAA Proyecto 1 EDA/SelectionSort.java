/*Autor: Guzman Ramirez Cesar
 * Ultima Fecha de modificacion: 18 de marzo de 2023
 * 
 * Proposito:
 * El código en Java implementa el algoritmo de ordenamiento por selección, 
 * el cual busca el elemento más pequeño en el arreglo y lo coloca en la primera posición. 
 * Luego, busca el siguiente elemento más pequeño y lo coloca en la segunda posición, 
 * y así sucesivamente hasta que todo el arreglo queda ordenado. 
 * El algoritmo es fácil de entender y programar, pero su complejidad temporal es O(n^2) 
 * lo que significa que puede ser muy ineficiente para arreglos grandes.
 */

 public class SelectionSort {
    public static int sort(int[] arr) {
        int comparisons = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return comparisons;
    }
}
