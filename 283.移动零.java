/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        var index = 0;
        var cursor = 0;
        while (cursor < len) {
            if (nums[cursor] != 0) {
                var temp = 0;
                temp = nums[index];
                nums[index] = nums[cursor];
                nums[cursor] = temp;
                index ++;
            }
            cursor ++;
        }
    }
}
// @lc code=end

