package org.example.TwoPointers;

import java.util.Arrays;

public class TwoSumInputArraysSorted {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }
        return result;
    }

    // solution very fast
    public static  int[] twoSum2(int[] numbers, int target) {
        int n=numbers.length;
        int i=0;
        int j=n-1;
        int sum=0;
        while(i<j){
            sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TwoSumInputArraysSorted test = new TwoSumInputArraysSorted();
        int[] result = test.twoSum2(new int[]{-10,-8,-2,1,2,5,6}, 0);
        System.out.println(Arrays.toString(result));
    }

}
