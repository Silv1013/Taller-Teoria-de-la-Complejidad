import java.util.*;

public class Metodos {

    public void burbujaMejorado(int[] arreglo) {
        int [] arregloOrdenado = arreglo.clone();
        int n = arreglo.length;
        boolean swapped;

        
        // Repetir hasta que no se realicen intercambios
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arregloOrdenado[i - 1] > arregloOrdenado[i]) {
                    // Intercambiar array[i - 1] y array[i]
                    int temp = arregloOrdenado[i - 1];
                    arregloOrdenado[i - 1] = arregloOrdenado[i];
                    arregloOrdenado[i] = temp;
                    swapped = true;
                }
            }
            // Reducir n porque el último elemento ya está en su lugar
            n--;
        } while (swapped);
    }
 public int[] insercionPrimero(int[] arreglo) {

        int[] arregloOrdenado = arreglo.clone();
        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > key) {
                arregloOrdenado[j + 1] = arregloOrdenado[j];
                j--;
                
                
            }
            arregloOrdenado[j + 1] = key;
        }
        return arregloOrdenado;
    }

    public int[] seleccionPrimero(int[] arreglo) {

        int[] arregloOrdenado = arreglo.clone();
        int tamano = arreglo.length;

        for (int i = 0; i < tamano - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < tamano; j++) {
                if (arregloOrdenado[j] < arregloOrdenado[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arregloOrdenado[indiceMinimo];
            arregloOrdenado[indiceMinimo] = arregloOrdenado[i];
            arregloOrdenado[i] = smallerNumber;
        }
        return arregloOrdenado;

    }



    // Método para imprimir el arreglo
    public void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
    

