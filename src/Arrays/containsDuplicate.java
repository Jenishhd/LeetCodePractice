package Arrays;

import java.util.HashMap;
import java.util.Map;

            public class containsDuplicate {
                public static void main(String[] args) {
                    int[] nums = new int[]{1,2,3,4,4,5,6,7,8,9,10,3};
                    System.out.println(containsDuplicate(nums));
                }

                public static boolean containsDuplicate(int[] nums) {
                    HashMap<Integer,Integer> map = new HashMap<>();
                    for(int i = 0; i < nums.length; i++) {
                        if(map.containsKey(nums[i])){
                            return true;
                        }
                        else{
                            map.put(nums[i], i);
                        }

                    }
                return false;
            }
}
