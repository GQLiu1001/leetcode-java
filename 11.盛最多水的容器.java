/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            int tempRes = Math.min(height[left], height[right]) * (right-left);
            res = Math.max(res, tempRes);
            if (height[left] >= height[right]) {
                right --;
            }else{
                left ++;
            }
        }
        return res;
    }
}
// @lc code=end

