package com.niuke.DailyContact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName TwoDay
 * @Description TODO
 * @Author lixinwei
 * @Date 2021/11/21 3:28 下午
 * @Version 1.0
 **/
public class TwoDay {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) return 0;
        int ans = 0;
        for (Node node : root.children) {
            ans = Math.max(ans, maxDepth(node));
        }
        return ans + 1;
    }
    /**
     * 给定一个整数数组 nums和一个整数目标值 target，
     * 请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     **/

    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
        //4   2   3    1       6
        //定义哈希表
        HashMap<Integer, Integer> map = new HashMap<>();
        //null
        //遍历nums数组
        for (int i = 0; i < nums.length; i++) {
            //如果target-当前下标对应的值存在于哈希表中
            if (map.containsKey(target - nums[i])) {
                //返回数组
                //0   1
                return new int[]{map.get(target-nums[i]),i};
            }
            //将i下标和i下标对应的值放进哈希表中
            //key    value
            //4        0
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }


}
