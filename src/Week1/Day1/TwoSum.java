package Week1.Day1;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = new int[] {2,1,3,5,7};
        int target = 7;

        HashMap<Integer, Integer> twoSumMap = new HashMap<>();
        int[] result = new int[2];
        for(int i =0; i< nums.length; i++) {
            int diff = target-nums[i];

            if(twoSumMap.containsKey(diff)) {
                result[0] = twoSumMap.get(diff);
                result[1] = i;
            }
            twoSumMap.put(nums[i], i);
        }

        System.out.println("two sum indices are "+ result[0]+ " and " + result[1]);

    }
}
