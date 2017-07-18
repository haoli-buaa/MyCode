package FindNumsAppearOnce;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int xsum = 0;
        int len = array.length;
        for(int i = 0; i < len; i++)
            xsum ^= array[i];
        int mask = 0;
        for(int i = 1; i <= xsum; i  <<= 1)
            if((xsum & i) != 0)
                mask = i;
        for(int i = 0; i < len; i++){
            if((array[i] & mask) == 0)
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }
    public static void main(String[] args){
    	//int[] a = {1,1,2,2,3,4,4,5,5,6,7,7};
    	int[] a = {2,4,3,6,3,2,5,5};
    	int[] b = new int[1];
    	int[] c = new int[1];
    	Solution sol = new Solution();
    	sol.FindNumsAppearOnce(a, b, c);
    	System.out.println(b[0]);
    	System.out.println(c[0]);
    }
}