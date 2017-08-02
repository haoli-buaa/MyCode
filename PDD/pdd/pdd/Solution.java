package pdd;
import java.util.Arrays;

public class Solution {
    public int mostKids(int[] w, int[] h){
    	int m = w.length;
    	int n = h.length;
    	int count = 0;
    	//排序;
    	Arrays.sort(h);
    	Arrays.sort(w);
    	//
    	int offset = m-1;
    	for(int i = n-1; i >= 0; ){
    		//在w[0]-w[offset]上查找第一个>= h[i]的数的下标
    		int index = getFirstLeq(w, h[i], offset);
    		if(index != -1){
    			count += offset -index + 1;
    			i -= offset -index + 1;
    			offset = index - 1;
    		}
    		else{
    			i--;
    		}
    	}
    	return count;
    }
    private int getFirstLeq(int[] a, int x, int offset){
    	for(int i = 0; i <= offset; i++)
    		if(a[i] >= x)
    			return i;
    	return -1;
    }
    public static void main(String[] args){
    	int[] w = {3,1};
    	int[] h = {2,2,3};
    	System.out.println(new Solution().mostKids(w, h));
    }
}