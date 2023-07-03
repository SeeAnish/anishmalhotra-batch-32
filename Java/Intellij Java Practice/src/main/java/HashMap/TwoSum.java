package HashMap;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int [] input = {10,20,30,40,50,60};
        int target2 = 100;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(input, target2)));
    }
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int remainder = target - nums[i];
            if(map.containsKey(remainder)) return new int[] {i, map.get(remainder)};
            map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}
