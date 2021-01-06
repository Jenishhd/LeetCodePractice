package Arrays;

public class searchRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(nums, 2));
    }
    public static int search(int nums[], int target) {
        if(nums.length == 1) {return nums[0];}

        int low = 0;
        int high = nums.length - 1;


        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] == target) {
                System.out.println("Found the answer: ");
                return mid;
            }

            else if (nums[mid] >= nums[low]) {
                if(target <= nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                }
                else
                    low = mid + 1 ;

            }

            else {
                if (target <= nums[high] && nums[mid] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }

        return -1;

    }
}
