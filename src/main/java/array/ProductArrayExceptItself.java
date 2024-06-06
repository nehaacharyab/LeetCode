package array;

import java.util.Arrays;

public class ProductArrayExceptItself {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int length = array.length;
        findProduct(array, length);
    }

    private static void findProduct(int[] array, int length) {
        int left=1;
        int right = 1;
        int[] productArr = new int[length];
        for (int i = 0; i < length; i++) {
            productArr[i] = left;
            left *= array[i];
        }


        for (int i = length-1; i >= 0; i--) {
            productArr[i] *= right;
            right *= array[i];
        }

        System.out.println(Arrays.toString(productArr));
    }
}
