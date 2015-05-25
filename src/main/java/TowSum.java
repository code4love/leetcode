/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1
 * must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p/>
 * Created by dengqiang on 15/5/26.
 */
public class TowSum {
    public int[] twoSum(int[] nums, int target) {
        int i1 = 0;
        int i2 = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    i1 = i + 1;
                    i2 = j + 1;
                    break;
                }
                j++;
            }
        }
        return new int[]{i1, i2};
    }

    public static void main(String[] args) {
        TowSum ts = new TowSum();
        int[] nums = new int[]{3,2,4};
        int target = 6;
        for (Integer i : ts.twoSum(nums, target)) {
            System.out.print(i + "\t");
        }
    }
}
