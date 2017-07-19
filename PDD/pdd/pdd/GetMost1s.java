package pdd;
import java.util.*;
public class GetMost1s {
	public ArrayList<ArrayList<Integer>> getMost1s(int[][] nums){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		int m = nums.length;
		boolean flag = false;
		//查找第一个含1的列
		//将该列所有含1的行、列记录下来
		if(m != 0){
			int n = nums[0].length;
			for(int j = 0; j < n; j++){
				for(int i = 0; i < m; i++)
					if(nums[i][j] == 1){
						flag = true;
						ArrayList<Integer> tmp = new ArrayList();
						tmp.add(i+1);//行号从1开始
						tmp.add(n - j);
						res.add(tmp);
					}
				if(flag)
					return res;
			}
		}
		return res;
	}
	public static void main(String[] args){
		int[][] nums = {{0, 0, 0, 0, 0, 0, 0, 1,1, 1, 1, 1},
					{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
					{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
					{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
					{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}};
		ArrayList res = new GetMost1s().getMost1s(nums);
		System.out.println(res);
	}
}
