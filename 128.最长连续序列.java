/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int res = 0;
        for (Integer integer : set) {
            if (set.contains(integer - 1)) {
                continue;
            }
            int len = 1;
            
            while (set.contains(integer + 1)) {
                integer++;
                len ++;
            }
            res = Math.max(len, res);
            
        }
        return res;
    }
}
// @lc code=end

