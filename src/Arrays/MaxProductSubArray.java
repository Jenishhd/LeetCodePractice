package Arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {
        int currentmax = nums[0];
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int output = 0;

        for(int i = 1; i < nums.length; i++) {
            maxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct*nums[i]));
            minProduct = Math.min(nums[i], Math.max(maxProduct * nums[i], minProduct*nums[i]));
            output = Math.max(output, currentmax);


            if(nums[i] >= 0) {
                output = Math.max(output, maxProduct);
            } else{
                output = Math.max(output, minProduct);
            }


        }
        return maxProduct;
    }
}
