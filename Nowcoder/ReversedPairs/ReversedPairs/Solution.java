package ReversedPairs;

public class Solution {
    public int InversePairs(int [] array) {
        int[] aux = new int[array.length];
        return (int)inversePairs(array, aux, 0, array.length-1)%1000000007 ;
    }
    long inversePairs(int[] a, int[] aux, int lo, int hi){
        if(lo >= hi)
            return 0;
        int mid = lo + (hi - lo)/2;
        long left = inversePairs(a, aux, lo, mid);
        long right = inversePairs(a, aux, mid+1, hi);
        long count = merge(a, aux, lo, mid, hi);
        return left + right + count;
    }
    long merge(int[] a, int[] aux, int lo, int mid, int hi){
        
        int i = mid;
        int j = hi;
        int k = hi;
        long count = 0;
        while(i >= lo && j>= mid+1){
            if(a[i]>a[j]){
                count += j - mid;
                aux[k--] = a[i--];
            }
            else{
            	aux[k--] = a[j--];
            }
    	}
        while(i >= lo)
            aux[k--] = a[i--];
        while(j >= mid+1)
            aux[k--] = a[j--];
        while(lo <= hi){
            a[lo] = aux[lo++];
        }
        return count;
    }
    public static void main(String[] args){
    	int[] a = {1,2,3,4,5,6,7,0};
    	Solution sol = new Solution();
    	int ans = sol.InversePairs(a);
    	System.out.println(ans);
    }
}