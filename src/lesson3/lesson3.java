package lesson3;

import java.util.Arrays;
import java.util.Random;

public class lesson3 {
    public static void main(String[] args) {
        array1();
        System.out.println();
        array2();
        System.out.println();
        array3();
        System.out.println();
        array4();
        array5(5, 10);
    }

    static void array1() {
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;


            }


        }

        System.out.println(Arrays.toString(arr));
    }

    static void array2() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += i;

        }
        System.out.println(Arrays.toString(arr2));
    }

    static void array3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }


        System.out.println(Arrays.toString(arr3));

    }

    static void array4() {
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr4[i] == arr4[j]) {
                    arr4[i][j] = 1;

                }


                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int[] array5(int len, int initialValue) {
        int[] arr5 = new int[len];
        Arrays.fill(arr5, initialValue);
        return arr5;

    }


}





