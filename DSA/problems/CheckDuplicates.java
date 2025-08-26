package problems;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,7,4,6,};
        System.out.println(isDuplicate(nums));
    }

//    brute force approach (not optimized), time complexity = O(n2)
    /*
    static boolean isDuplicate (int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

     */

//    not optimized, thought it would work, time complexity = O(n2)
    /*
    static boolean isDuplicate (int[] nums) { //nums = {1,3,5,6}

        int i = 0;
        int k = i+1;
        int l = nums.length;

        while (i < l && k < l) {
            if (nums[i] == nums[k]) {
                return true;
            } else if (k == nums.length-1 && i < l-1 ) {
                i++;
                k = i+1;
            } else {
                k++;
            }
        } return false;
    }

     */

//    optimized HashSet approach, time complexity = O(n)
    static boolean isDuplicate (int[] nums) {

        Set<Integer> sett = new HashSet<>();

        for (int k : nums) {
            if (sett.contains(k)) {
                return true;
            } else {
                sett.add(k);
            }
        } return false;
    }
}

/*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.
* */
