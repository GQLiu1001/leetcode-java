/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(target - nums[i])) {
                return new int[]{i,map.get(target - nums[i])};
           }else{
                map.put(nums[i], i);
           }
        }
        return null;

    }
}
// @lc code=end

