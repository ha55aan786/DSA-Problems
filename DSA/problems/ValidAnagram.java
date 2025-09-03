package problems;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "car";
        System.out.println(isAnagram("aacc", "ccac"));
    }
    static boolean isAnagram(String str1, String str2) {

        Map<Integer, Character> map = new HashMap<>();
//        Have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

//        Have the same characters
        for (int i =0; i < str1.length() ; i++) {
            map.put(i, str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!map.containsValue(str2.charAt(i))) {
                return false;
            }
        }

        // Step 3: reduce frequency using str2
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);

    }
}


/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
* */