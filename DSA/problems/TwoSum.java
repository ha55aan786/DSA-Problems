package problems;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int[] k = returnIndexes(nums, 10);
        for (int j : k) {
            System.out.println(j);
        }
    }

    public static int[] returnIndexes (int[] nums, int target) {
        int x = 0;
        int y = 1;

        while (x < nums.length - 1) {
            if (nums[x] + nums[y] == target) {
                break;
            }
            if (y >= nums.length - 1) {
                x++;
                y = x + 1;
            } else {
                y++;
            }
        }

        return new int[]{x, y};

    }

}