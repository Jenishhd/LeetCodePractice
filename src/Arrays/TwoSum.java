package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] inputarr = new int[]{3,2,4};
        System.out.println(Arrays.toString(getTwoSum(inputarr,7)));

        System.out.println(Arrays.toString(getTwoSumOptimized(inputarr,7)));


    }

    //BRUTEFORCE
    public static int[] getTwoSum(int[] nums, int target){
        if(nums.length == 0) {
            System.out.println("Array is empty");
            return new int[0];
        }


        int sum = 0;
        int[] resultArr = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return resultArr;
    }


    public static int[] getTwoSumOptimized(int[] nums, int target) {
        HashMap<Integer,Integer> arrmap = new HashMap();
        if(nums.length == 0) { return new int[0]; }
        for(int i = 0; i < nums.length; i++) {
            arrmap.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++) {
            if(arrmap.containsKey(target - nums[i]) && arrmap.get(target - nums[i]) != i){
                return new int[] {i, arrmap.get(target - nums[i])};
            }
        }

        return new int[0];
    }

}
