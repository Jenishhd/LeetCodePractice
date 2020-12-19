package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayProductExceptSelf {
    public static void main(String[] args) {
        int[] testArray = new int[4];
        testArray[0] = 1;
        testArray[1] = 2;
        testArray[2] = 3;
        testArray[3] = 4;
        System.out.println(Arrays.toString(productExceptSelf(testArray)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int rightArray[] = new int[nums.length];
        int leftArray[] = new int[nums.length];
        int result[] = new int[nums.length];

        leftArray[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftArray[i] = nums[i-1] * leftArray[i-1];
        }

        rightArray[rightArray.length - 1] = 1;

        for(int i = rightArray.length - 2 ; i >= 0; i--) {
            rightArray[i] = rightArray[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            result[i] = leftArray[i] * rightArray[i] ;
        }

        return result;
    }
}
