package algo.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * This method has time complexity O(n^2) space complexity O(1)
     * @param nums array of integers
     * @param target an integer
     * @return return indices of the two numbers such that they add up to target
     */
    public int[] twoSumSolutionWithBruteForce(int[] nums, int target) {
        for(int i=0; i < nums.length; i++){

            int remainingBalance = target - nums[i];

            for(int j = i+1; j < nums.length; j++){
                if(remainingBalance == nums[j]){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    /**
     * This method has time complexity O(1) space complexity O(n)
     * @param nums array of integers
     * @param target an integer
     * @return  return indices of the two numbers such that they add up to target
     */
    public int[] twoSumSolutionWithMap(int[] nums, int target){

        Map<Integer, Integer> memory = new HashMap<>();

        for(int currIndex=0; currIndex < nums.length; currIndex++){
            int currentValue = nums[currIndex];
            int remainingBalance = target - currentValue;
            if(memory.containsKey(remainingBalance)){
                return new int[]{memory.get(remainingBalance), currIndex};
            }else{
                memory.put(currentValue, currIndex);
            }

        }

        return null;
    }
}
