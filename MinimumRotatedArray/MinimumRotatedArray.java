package com.company;

public class MinimumRotatedArray {
    public int findMin(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        int min = 0;
        int first =0,last=nums.length-1;

        if (nums[last] > nums[0]) {
            return nums[0];
        }
        while (first <= last){
            int  mid =first +(last-first)/2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }


            if (nums[mid] > nums[0]) {
                first = mid + 1;
            } else {

                last = mid - 1;
            }
        }
        return -1;
    }
    }

