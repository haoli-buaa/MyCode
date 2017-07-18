package FindContinuousSequence;

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	int small = 1, big = 2;
    	int middle = (sum-1)/2;
    	int cursum = 3;
    	while(small <= middle){
    		if(cursum < sum){
        		big++;
        		cursum += big;  
    		}
    		else{
    			if(cursum == sum)
    				addSequence(res,small,big);
    			cursum -= small;
    			small++;
    		}    				
    	}
    	return res;
    }
    void addSequence(ArrayList<ArrayList<Integer>> list, int lo, int hi){
    	ArrayList<Integer> seq = new ArrayList<Integer>();
    	while(lo <= hi)
    		seq.add(lo++);
    	list.add(seq);
    }
    public static void main(String[] args){
    	//int sum = 0;
    	//int sum = 3;
    	int sum = 15;
    	Solution sol = new Solution();
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	result = sol.FindContinuousSequence(sum);
    	System.out.println(result.toString());
    	System.out.println("Find Continuous Sequence");
    }
}
