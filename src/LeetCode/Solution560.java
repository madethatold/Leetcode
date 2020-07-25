package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//560. 和为K的子数组
public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j<nums.length; j++) {
                sum=sum+nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
