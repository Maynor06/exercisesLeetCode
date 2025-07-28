package org.example.Arrays;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Set<Integer> repeat = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                repeat.add(nums[i]);
            }
            set.add(nums[i]);
        }

        List<Integer> sorted = new ArrayList<>(set);
        List<Integer> sortedReverse = new ArrayList<>(sorted);

        if(repeat.size() == 0) {
            for (int i = 0; i < k; i++) {
                result[i] = sorted.get(i);
            }
        }else {
            for (int i = 0; i < k; i++){
                result[i] = sortedReverse.get(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements t = new TopKFrequentElements();

        int[] print = t.topKFrequent(new int[]{1}, 1);

        System.out.println(Arrays.toString(print));
    }
}
