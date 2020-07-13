package com.huazheng;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Solution
 * @Description
 * @Date 2020/7/13 17:31
 * @Created by zhanghuazheng
 */
public class Solution {
    public static void main(String[] args) {
        int[] num={2,11,13,7};
        int[] ints = twoSum(num, 9);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 计算一个数组中两个数的和是目标值，返回他们的数组下标
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (map.containsKey(com)) {
                System.out.println(System.currentTimeMillis()-start);
                return new int[]{map.get(com), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("no such two args");
    }


    /**
     * 传统的暴力方法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        long start = System.currentTimeMillis();
        System.out.println(start);

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j]==target-nums[i]){
                    System.out.println(System.currentTimeMillis()-start);
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no such two args");
    }

}



