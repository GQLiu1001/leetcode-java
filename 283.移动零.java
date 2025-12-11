/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
    int left = 0;
    int right = 0;
    int len = nums.length;
    while (right < len) {
        if (nums[right] != 0) {
            var temp = 0;
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
        }
        right ++;
    }
    }
}
// @lc code=end

