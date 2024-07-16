package array;

public class ThreeValueSum {

    public static void main(String[] args) {
        int[] array = {2,4,5,8,9};
        int target = 17;
        int low, high, sum;

        for (int i = 0; i < array.length; i++) {
            low = i+1;
            high = array.length-1;
            while(low < high){
                sum = array[i] + array[low] + array[high];
                if(sum == target){
                    System.out.println("Present "+ array[i]
                            +" "+ array[low] +" "+ array[high]);
                }
                if(sum > target){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
    }
}
