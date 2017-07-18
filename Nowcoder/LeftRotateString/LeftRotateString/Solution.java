package LeftRotateString;

public class Solution {
	public String LeftRotateString(String str,int n) {
		if(str == null)
			return null;
		if(str.length() == 0)
			return str;
		n = n % str.length();
		StringBuilder sb = new StringBuilder();
		sb.append(str.substring(n,str.length()));
		sb.append(str.substring(0,n));
        return sb.toString();
    }
	public static void main(String[] args){
		String str = "abcdefg";
		Solution sol = new Solution();
		System.out.println(sol.LeftRotateString(str, 8));
	}
}
