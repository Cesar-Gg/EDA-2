/*Autor: Guzman Ramirez Cesar
 * Ultima Fecha de modificacion: 18 de marzo de 2023
 * 
 * Proposito:
 * El propósito del algoritmo Bubble Sort es ordenar una lista de elementos de manera ascendente o 
 * descendente mediante la comparación y el intercambio de elementos adyacentes en la lista. 
 * En cada iteración, el algoritmo compara dos elementos adyacentes y los intercambia si están en el orden incorrecto. 
 * El proceso se repite hasta que no haya más elementos adyacentes que intercambiar. 
 * 
 */

 public class BubbleSort {
  public static int sort(int[] arr) {
      int n = arr.length;
      int comparisons = 0;
      int passes = 0;
      for (int i = 0; i < n - 1; i++) {
          boolean swapped = false;
          for (int j = 0; j < n - i - 1; j++) {
              comparisons++;
              if (arr[j] > arr[j + 1]) {
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                  swapped = true;
              }
          }
          passes++;
          if (!swapped) {
              break;
          }
      }
      return passes;
  }
}

