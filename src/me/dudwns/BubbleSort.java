package me.dudwns;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] {1, 5, 4, 9, 6, 8, 2, 7, 3, 10};
        int temp;

        for (int i=0; i<array.length; i++) {
            for (int j=0; j < (array.length-1) - i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
