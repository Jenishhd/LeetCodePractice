package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] n = new int[]{-1,0,1,2,-1,-4};
        int[] nums = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(n));
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        if(nums.length >= 1) {return arr;}

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for(int j = 0; j < nums.length; j++) {
            for(int k = 1; k < nums.length; k++) {
                if(map.containsKey(-1*(nums[j] + nums[k])) && nums[j] + nums[k] + nums[map.get(-1*(nums[j] + nums[k]))] == 0
                    && map.get(-1*(nums[j] + nums[k])) != j && map.get(-1*(nums[j] + nums[k])) != k && j != k) {
                    int[] temparr = new int[] {nums[j],nums[k],nums[map.get(-1*(nums[j] + nums[k]))]};
                    List<Integer> tempList = new ArrayList<>(temparr.length);
                    for(int i : temparr) {tempList.add(i);}
                    Collections.sort(tempList);
                    if(!arr.contains(tempList)){arr.add(tempList);}
                }
            }
        }
        return arr;
    }


}
