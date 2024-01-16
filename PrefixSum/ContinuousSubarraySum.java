package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    
     public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer>  m = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            int temp = sum % k;
            if(i>0 && temp==0) return true;
            boolean enter = true;
            if(m.containsKey(temp) && (i - m.get(temp)) > 1) {
                return true;
            }else if(m.containsKey(temp) ){
                enter = false;
            }
            if(enter) m.put(temp, i);
        }
        return false;
    }
}

// intuition - 
// if a % b = c and we are going to add multiple of b in a then remainder will always be same;
//  ex - 31 % 8 = 7;
//       (31 + 64) % 8 = 7;   
