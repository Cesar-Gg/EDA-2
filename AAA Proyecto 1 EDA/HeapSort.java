/* Autor: Guzman Ramirez Cesar

Última Fecha de Modificación: 25 de marzo de 2023
*/
public class HeapSort {
    public static int sort(int[] arr) {
    int comparisons = 0;
    int n = arr.length;
    

        // Construir el Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            comparisons += heapify(arr, n, i);
        }
    
        // Extraer elementos uno por uno del heap
        for (int i = n - 1; i >= 0; i--) {
            // Mover la raíz actual al final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
    
            // Llamar a heapify en el heap reducido
            comparisons += heapify(arr, i, 0);
        }
        return comparisons;
    }
    
    public static int heapify(int[] arr, int n, int i) {
        int comparisons = 0;
        int largest = i; // Inicializar el nodo más grande como la raíz
        int l = 2 * i + 1; // izquierda = 2*i + 1
        int r = 2 * i + 2; // derecha = 2*i + 2
    
        // Si el hijo izquierdo es más grande que la raíz
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        comparisons++;
    
        // Si el hijo derecho es más grande que el más grande hasta ahora
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        comparisons++;
    
        // Si el nodo más grande no es la raíz
        if (largest != i) {
            // Intercambiar la raíz con el nodo más grande
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
    
            // Recursivamente heapify el subárbol afectado
            comparisons += heapify(arr, n, largest);
        }
        return comparisons;
    }
    }