package MergeSortedArrays;

public class Solution {
	public int[] mergeTwo(int[] a, int[] b){
		//a.length = m; b.length = n; overall complexity O(m+nlogm)	
		int len = 0;
		//O(m)
		for(int i = 0; i < a.length; i++){
			if(i != 0 && a[i] == a[i-1])
				continue;
			len++;
		}
		//O(n*logm)
		for(int i = 0; i < b.length; i++){			
			if(binaSearch(a,b[i]) || ( i != 0 && b[i] == b[i-1]))
				continue;
			len++;
		}
		int[] result = new int[len];
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length){
			int min = a[i];			
			if(a[i] < b[j])
				i++;
			else{
				min = b[j];
				j++;
			}
			if(k != 0 && min == result[k-1])
				continue;
			result[k++] = min;			
		}
		while(i < a.length){
			int cur = a[i++];
			if(k != 0 && cur == result[k-1])
				continue;
			result[k++] = cur;
		}
		while(j < b.length){
			int cur = b[j++];
			if(k != 0 && cur == result[k-1])
				continue;
			result[k++] = cur;
		}
		return result;		
	}
	boolean binaSearch(int[] a, int x){
		int lo = 0;
		int hi = a.length-1;		
		while(lo <= hi){		
			int mid = lo + (hi - lo)/2;
			if(a[mid] == x)
				return true;
			if(a[mid] > x)
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		return false;
	}
	public static void main(String[] args){
		//int[] a = {1,2,3,8,9};
		//int[] b = {3,4,5};
		int[] a = {1,1,2,2,3,3,4,8,9};
		int[] b = {3,4,4,5,5,6,6,6,7,9};
		Solution sol = new Solution();
		int[] res = sol.mergeTwo(a, b);
		for(int i = 0; i < res.length; i++){
			if(i == res.length)
				System.out.print(res[i]);
			else
				System.out.printf("%d\t",res[i]);
		}
	}
}
