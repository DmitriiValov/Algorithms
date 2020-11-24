package com.robertino.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] results = new TwoSum().twoSum2(nums, target);
        System.out.println(results);
    }

    // O(N^2)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    // O(N)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; ++i) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[] { map.get(difference), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
