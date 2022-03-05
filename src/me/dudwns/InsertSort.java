package me.dudwns;

public class InsertSort {
    public static void main(String[] args) {
        int array[] = new int[] {9, 8, 1, 3, 2, 4, 7, 12, 10, 40, 30, 20};
        //                       j  i

        int prev, temp;

        for (int i=1; i<array.length; i++) {
            prev = i - 1;

            while (prev >= 0 && array[prev+1] < array[prev]) {
                temp = array[prev];
                array[prev] = array[prev+1];
                array[prev+1] = temp;
                prev--;
            }
        }

        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
