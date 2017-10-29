package cn.edu.buaa.haoli.dp;

import java.util.Scanner;

public class LongestPalindromeSubstring {

	/**
	 * state tranform:
	 * p[i,j] = 1, if(p[i+1, j-1]==1 && s[i]==s[j]),
	 *        = 0, else
	 * initialization:
	 * p[i,i] = 1;
	 * p[i,i+1] = 1, if(s[i] == s[i+1])
	 */
	public static int dpStyle(String str){
		int len = str.length();
		int max = 1;
		int start = 0;
		int[][] p = new int[len][len];
		for(int i = 0; i < len; i++){
			p[i][i] = 1;
			if(i != len-1 && str.charAt(i) == str.charAt(i+1)){
				p[i][i+1] = 1;
				max = 2;
			}
		}
		
		for(int plen = 3; plen <= len; plen++){
			for(int i = 0; i+plen-1 < len; i++){
				int j = i + plen - 1;
				if(str.charAt(i) == str.charAt(j) && p[i+1][j-1] == 1){
					p[i][j] = 1;
					start = i;
					max = plen;
				}
			}
		}
		System.out.println(str.substring(start, start+max));
		return max;
	}
	public static int center(String str){
		if(str == null || str.length() == 0)
			return 0;
		int start = 0;
		int max = 1;
		for(int i = 0; i < str.length(); i++){
			int l = i-1;
			int r = i+1;
			while(r < str.length() && str.charAt(i) == str.charAt(r)){				
				if(r-i+1 > max){
					max = r-i+1;
					start = i;
				}
				r++;
			}
			while(l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)){
				if(r-l+1 > max){
					start = l;
					max = r-l+1;
				}
				l--;
				r++;
			}
		}
		System.out.println(str.substring(start, start+max));
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String a = sc.nextLine().trim();
			int res = dpStyle(a);
			System.out.println(res);
			System.out.println(center(a));
		}
		sc.close();
	}
}
