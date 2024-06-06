package array;

/**
 * Given an integer array number and an integer val, remove all occurrences of val in number in-place.
 * The order of the elements may be changed. Then return the number of elements in number which are not equal to val.
 *
 * Consider the number of elements in number which are not equal to val be k, to get accepted, you need to do the following things:
 *
 * - Change the array number such that the first k elements of number contain the elements which are not equal to val.
 * - The remaining elements of number are not important as well as the size of number.
 * - Return k.
 *
 * Input: number = [3,2,2,3], val = 3
 * Output: 2, number = [2,2,_,_]
 */
public class RemoveElement {

    public static int removeElement(int[] number, int val) {
        int k = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i] != val){
                number[k] = number[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] number = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(number, val));
    }
}
