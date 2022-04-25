package com.company;

import java.util.Hashtable;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        /*    int[] arr = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                       return new int[] {i,j};
                    }
                }
            } */

        Hashtable<Integer, Integer> hashtable = new Hashtable<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (hashtable.containsKey(t) ) {
                return new int[]{i, hashtable.get(t)};
            }
            hashtable.put(nums[i],i );
        }
        return null;
    }
}


