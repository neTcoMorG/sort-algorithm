package me.dudwns;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = new int[] {1, 5, 4, 9, 6, 8, 2, 7, 3, 10};
        int index = 0, temp;

        for (int i=0; i < array.length; i++) {
            int min = 999;

            for (int j=i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }

            System.out.print(" index[" + i + "], min " + min + " " + "   Before ");
            for (int p : array) {
                System.out.print(p + " ");
            }

            temp = array[i];
            array[i] = array[index];
            array[index] = temp;

            System.out.print(" After ");
            for (int p : array) {
                System.out.print(p + " ");
            }

            System.out.println();
        }
    }
}
