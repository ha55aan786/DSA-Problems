package problems;

//public class ProductOfArrayWithoutSelf {
//
//    static int[] productOfNums (int[] nums) {
//
//        }
//
//    }
//
//}

import java.util.Arrays;

public class ProductOfArrayWithoutSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

//    public static int[] productExceptSelf (int[] array) {
//        int[] result = new int[array.length];
//        Arrays.fill(result, 1);
//
//        for (int i = 1; i < array.length; i++) {
//            result[i] = array[i] * result[i];
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            result[i] = array[i] * result[i];
//        }
//
//        return result;
//    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: prefix product
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: suffix product (running from right to left)
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}





/*
* nums = {1,2,3,4}
* create arrays result, prefix and suffix of length of n-1
* run loop = i =0 for prefix and suffix
* add data in result array of index i by multiplying
*
*
*
* */

/*
* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
