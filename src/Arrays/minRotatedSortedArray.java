package Arrays;

public class minRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,6,1,2,3,4,5};
        System.out.println(nums);

    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int findMinBS(int[] nums) {
        if(nums.length == 1) {return nums[0];}

        if(nums[0] < nums[nums.length - 1]) {return nums[0];}


        int low = nums[0];
        int high = nums.length - 1;

        while(true) {
            int mid = low + (high - low)/2;

            if(nums[mid + 1] < nums[mid] ){
                return nums[mid + 1];
            }

            if(nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if(nums[mid] > nums[0]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }



    }
}
