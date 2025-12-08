/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str); // 必须添加当前字符串
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
// @lc code=end
