

public class Main {
    public static void main(String[] args) {
        /////////////////////// [Timer] ///////////////////////
        long start = (System.nanoTime());

        /////////////////////// [Random Array] ///////////////////////
        int[] array = new int[153];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        /////////////////////// [Printing random Array] ///////////////////////
        System.out.print("Random array: [ ");
        for (int p : array) {
            System.out.print(p + " | ");
        }
        System.out.print(" ]");
        /////////////////////// [Sorting Random Array using "Bubble Sort"] ///////////////////////

        //Decide with you want to use by commenting other
        //EasyBubbleSort(array);
        //MediumBubbleSort(array);
        //HalfRecursiveBubbleSort(array, array.length);
        //AllRecursiveBubbleSort(array, array.length, 0,1);
        System.out.println("\n");

        /////////////////////// [Printing Sorted Array] ///////////////////////
        System.out.print("Sorted Array: [ ");
        for (int x : array) {
            System.out.print(x + " | ");
        }
        System.out.print(" ]");

        /////////////////////// [Timer] ///////////////////////
        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println("\n" + duration + " ms");

    }


    /////////////////////// [Implementing "Bubble Sort"] ///////////////////////
    public static void EasyBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }

    public static void MediumBubbleSort(int[] array) {
        boolean somethingSwapped = true;
        while (somethingSwapped) {
            somethingSwapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    somethingSwapped = true;
                }
            }
        }
    }

    public static void HalfRecursiveBubbleSort(int[] array,int array_length){
        if (array_length > 0) {
            for (int i = 0; i < array_length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    HalfRecursiveBubbleSort(array,array_length-1);
                }
            }
        }
    }

    public static void AllRecursiveBubbleSort(int[] array,int array_length, int f, int s){
        if(array_length >= 2 && s < array_length){
            if(array[f] > array[s]){
                int temp = array[f];
                array[f] = array[s];
                array[s] = temp;
            }

            if(s != array_length-1){
                AllRecursiveBubbleSort(array, array_length, f+1, s+1);
            } else {
                AllRecursiveBubbleSort(array, array_length-1, 0,1);
            }
        }
    }
}