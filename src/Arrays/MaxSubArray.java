package Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] testArray = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(testArray));
    }


    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        if(nums.length == 1) {
            return nums[0];
        }

        for(int i = 1; i < nums.length; i++) {
                sum = Math.max(nums[i], sum+nums[i]);
                if(sum > max) {
                    max = sum;
                }
            }
            return max;
        }


    }

