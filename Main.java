import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de numeros:");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los numeros:");

        for(int i=0;i<n;i++){
            arreglo[i] = sc.nextInt();
        }

        System.out.println("\nSeleccione metodo de ordenamiento");

        System.out.println("1 Selection Sort");
        System.out.println("2 Bubble Sort");
        System.out.println("3 Insertion Sort");
        System.out.println("4 Merge Sort");
        System.out.println("5 Quick Sort");
        System.out.println("6 Heap Sort");
        System.out.println("7 Counting Sort");
        System.out.println("8 Radix Sort");
        System.out.println("9 Bucket Sort");

        int opcion = sc.nextInt();

        switch(opcion){

            case 1:
                SelectionSort.sort(arreglo);
                break;

            case 2:
                BubbleSort.sort(arreglo);
                break;

            case 3:
                InsertionSort.sort(arreglo);
                break;

            case 4:
                MergeSort.sort(arreglo,0,arreglo.length-1);
                break;

            case 5:
                QuickSort.sort(arreglo,0,arreglo.length-1);
                break;

            case 6:
                HeapSort.sort(arreglo);
                break;

            case 7:
                CountingSort.sort(arreglo);
                break;

            case 8:
                RadixSort.sort(arreglo);
                break;

            case 9:
                BucketSort.sort(arreglo);
                break;

            default:
                System.out.println("Opcion invalida");
        }

        System.out.println("\nArreglo Ordenado:");

        for(int num : arreglo){
            System.out.print(num + " ");
        }
        sc.close();

    }

}