package cn.edu.buaa.nlsde.haoli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author li
 *source：https://leetcode.com/problems/4sum/description/
 *思路：递归解决
 */
public class Sum4 {
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        fourSum(nums, 0, 4, 1, target, new ArrayList<Integer>(), result);
        return result;
    }
	private void fourSum(int[] nums, int offset, int n, int depth, 
			int target, List<Integer> prev, List<List<Integer>> result) {
		if (n == depth) {
			int lo = offset;
			int hi = nums.length-1;
			while (lo <= hi) {
				int mid = lo + (hi - lo)/2;
				if(nums[mid] == target) {
					List<Integer> current = new ArrayList<Integer>(prev);
					current.add(target);
					result.add(current);
					return;
				} else if (nums[mid] > target) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			}
			return;
		} else {
			for (int i = offset; i + n - depth < nums.length; i++ ) {
				if (i == offset || nums[i] != nums[i-1]) {
					List<Integer> now = new ArrayList<Integer>(prev);
					now.add(nums[i]);
					//这里的每次循环（i改变）中，prev不应该被改变。
					//这也是为什么我构造了now 而不是直接改变prev的原因，但是每次执行完下面的句子以后，
					//prev就变成了now？？？
					fourSum(nums, i+1, n, depth+1, target - nums[i], now, result);
				}
			}
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {1, 0, -1, 0, -2, 2};
		List<List<Integer>> list = new Sum4().fourSum(nums, 0);
		System.out.println(list);
	}

}
