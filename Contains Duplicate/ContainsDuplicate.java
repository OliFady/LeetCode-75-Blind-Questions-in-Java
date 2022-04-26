package com.company;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

      /*  for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i] == nums[j])
                return true;
            }
        }
        return false;
    }*/

        HashMap<Integer, Integer> NewNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (NewNums.containsKey(nums[i])) {
            return true;
            } else {
                NewNums.put(i, 1);
            }

        }
return false;
    }
}

