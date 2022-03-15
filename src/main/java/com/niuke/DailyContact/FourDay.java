package com.niuke.DailyContact;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FourDay
 * @Description TODO
 * @Author lixinwei
 * @Date 2021/11/24 9:38 下午
 * @Version 1.0
 **/
public class FourDay {
    public static String originalDigits(String s) {
//        HashMap<Object, Object> map = new HashMap<>();
//        StringBuilder sb = new StringBuilder();
//        char[] chars = s.toCharArray();
//        int[] nums = new int[10];
//        for (int i = 0; i < chars.length; i++) {
//            map.put(chars[i],0);
//        }
//        for (int i = 0; i < chars.length; i++) {
//            if (map.containsKey(chars[i])) {
//                int num = (int) map.get(chars[i]);
//                map.put(chars[i],++num);
//            }
//        }
//
//        //zero一个z代表一个0
//        if (map.containsKey('z')) {
//            int num = (int) map.get('z');
//            nums[0] = num;
//            map.remove('z');
//            map.put('e',(int) map.get('e')-num);
//            map.put('r',(int) map.get('r')-num);
//            map.put('o',(int) map.get('o')-num);
//        }
//
//        //two一个w代表一个2
//        if (map.containsKey('w')) {
//            int num = (int) map.get('w');
//            nums[2] = num;
//            map.remove('w');
//            map.put('t',(int) map.get('t')-num);
//            map.put('o',(int) map.get('o')-num);
//        }
//
//        //eight一个g代表一个8
//        if (map.containsKey('g')) {
//            int num = (int) map.get('g');
//            nums[8] = num;
//            nums[3] = (int) map.get('h') - num;
//            map.remove('g');
//            map.put('e',(int) map.get('e')-num);
//            map.put('i',(int) map.get('i')-num);
//            map.put('h',(int) map.get('h')-num);
//            map.put('t',(int) map.get('t')-num);
//        }
//
//        //six一个x代表一个6
//        if (map.containsKey('x')) {
//            int num = (int) map.get('x');
//            nums[6] = num;
//            nums[7] = (int) map.get('s')-num;
//            map.remove('x');
//            map.put('s',(int) map.get('s')-num);
//            map.put('i',(int) map.get('i')-num);
//        }
//
////        //three去完two和eight还有t就是3
////        if (map.containsKey('t') && (int) map.get('t') > 0) {
////            int num = (int) map.get('t');
////            nums[3] = num;
////            map.remove('t');
////            map.put('h',(int) map.get('h')-num);
////            map.put('r',(int) map.get('r')-num);
////            map.put('e',(int) map.get('e')-num);
////            map.put('e',(int) map.get('e')-num);
////        }
//
////        //seven去完six还有s就是7
////        if (map.containsKey('s') && (int) map.get('s') > 0) {
////            int num = (int) map.get('s');
////            nums[7] = num;
////            map.remove('s');
////            map.put('e',(int) map.get('e')-num);
////            map.put('v',(int) map.get('v')-num);
////            map.put('e',(int) map.get('e')-num);
////            map.put('n',(int) map.get('n')-num);
////        }
//
//        //five去完seven还有v就是5
//        if (map.containsKey('v') && (int) map.get('v') > 0) {
//            int num = (int) map.get('v');
//            nums[5] = num;
//            nums[4] = (int) map.get('f')-num;
//            map.put('f',(int) map.get('f')-num);
//            map.put('i',(int) map.get('i')-num);
//            map.remove('v');
//            map.put('e',(int) map.get('e')-num);
//        }
//
////        //four去掉five还有f就是4
////        if (map.containsKey('f') && (int) map.get('f') > 0) {
////            int num = (int) map.get('f');
////            nums[4] = num;
////            map.remove('f');
////            map.put('o',(int) map.get('o')-num);
////            map.put('u',(int) map.get('u')-num);
////            map.put('r',(int) map.get('r')-num);
////        }
//
//        //one有o有n就是1
//        if (map.containsKey('o') && (int) map.get('o') > 0) {
//            int num = (int) map.get('o');
//            nums[1] = num;
////            map.remove('o');
////            map.put('n',(int) map.get('n')-num);
////            map.put('e',(int) map.get('e')-num);
//        }
//
//        //nine有n有i就是9
//        if (map.containsKey('i') && (int) map.get('i') > 0) {
//            int num = (int) map.get('i');
//            nums[9] = num;
//            map.put('n',(int) map.get('n')-num);
//            map.remove('i');
//            map.put('n',(int) map.get('n')-num);
//            map.put('e',(int) map.get('e')-num);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            while (nums[i] > 0) {
//                sb.append(i);
//                nums[i] = nums[i] - 1;
//            }
//        }
//        return String.valueOf(sb);
        Map<Character, Integer> c = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }

        int[] cnt = new int[10];
        cnt[0] = c.getOrDefault('z', 0);
        cnt[2] = c.getOrDefault('w', 0);
        cnt[4] = c.getOrDefault('u', 0);
        cnt[6] = c.getOrDefault('x', 0);
        cnt[8] = c.getOrDefault('g', 0);

        cnt[3] = c.getOrDefault('h', 0) - cnt[8];
        cnt[5] = c.getOrDefault('f', 0) - cnt[4];
        cnt[7] = c.getOrDefault('s', 0) - cnt[6];

        cnt[1] = c.getOrDefault('o', 0) - cnt[0] - cnt[2] - cnt[4];

        cnt[9] = c.getOrDefault('i', 0) - cnt[5] - cnt[6] - cnt[8];

        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < cnt[i]; ++j) {
                ans.append((char) (i + '0'));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(originalDigits("fviefuro"));
    }
}
