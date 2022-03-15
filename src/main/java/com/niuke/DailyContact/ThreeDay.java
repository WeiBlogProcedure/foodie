package com.niuke.DailyContact;

import java.util.Arrays;

/**
 * @ClassName ThreeDay
 * @Description TODO
 * @Author lixinwei
 * @Date 2021/11/23 9:50 下午
 * @Version 1.0
 **/
public class ThreeDay {

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                if (count[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < goal.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
        }
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("bb", "bb"));
    }
}
