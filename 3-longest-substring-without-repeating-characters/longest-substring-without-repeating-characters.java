import java.util.HashMap;
import java.util.Map;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);

            int currentWindowLength = right - left + 1;
            if (currentWindowLength > maxLength) {
                maxLength = currentWindowLength;
            }
        }

        return maxLength;
    }

}