package MedianOfTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*//时间空间复杂度都为O（m+n）的算法
    	int[] merge = new int[nums1.length + nums2.length];
    	int i = 0, j = 0, p = 0;
    	while(i < nums1.length && j < nums2.length){
    		if(nums1[i] < nums2[j])
    			merge[p++] = nums1[i++];
    		else
    			merge[p++] = nums2[j++];
    	}
    	while(i < nums1.length)
    		merge[p++] = nums1[i++];
    	while(j < nums2.length)
    		merge[p++] = nums2[j++];
    	if(merge.length == 0)
    		return -1;
    	return merge.length % 2 == 0 ? ((double)merge[merge.length/2-1]+merge[merge.length/2])/2.0 : merge[merge.length/2];*/
    	//时间复杂度为O(log(m+n))
    	int len1 = nums1.length;
    	int len2 = nums2.length;
    	int s1 = 0;
    	int s2 = 0;
    	if(len1 == 0)
    		return getMedian(nums2, 0, nums2.length);
    	if(len2 == 0)
    		return getMedian(nums1, 0, nums2.length);
    	while(len1 > 1 && len2 > 1){
    		if(getMedian(nums1, s1, len1) == getMedian(nums2, s2, len2))
    			return getMedian(nums1, s1, len1);
    		int[] a = updateLength(nums1, s1, len1);
    		s1 =  a[0];
    		len1 = a[1];
    		int[] b = updateLength(nums2,s2,len2);
    		s2 = b[0];
    		len2 = b[1];
    	}
    }
    int[] updateLength(int[] nums, int start, int len){
    	int[] res = new int[2];
    	if(len%2 == 0){
    		res[0] = start + len/2 - 1;
    		res[1] = len/2+1;
    	}
    	else{
    		res[0] = start + len/2;
    		res[1] = len/2+1; 
    	}
    	return res;
    }
    double getMedian(int[] nums, int start, int len){
    	if(len <= 0)
    		return -1;
    	if(len % 2 == 0)
    		return (nums[start+len/2-1]+nums[start+len/2])/2.0;
    	else
    		return nums[start+len/2];
    }
    public static void main(String[] args){
    	int[] a = {1,2};
    	int[] b = {3,4};
    	System.out.println(new Solution().findMedianSortedArrays(a, b));
    }
}