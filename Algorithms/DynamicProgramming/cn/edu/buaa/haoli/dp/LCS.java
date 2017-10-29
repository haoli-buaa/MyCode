package cn.edu.buaa.haoli.dp;
import java.util.Scanner;


public class LCS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String a = sc.nextLine().trim();
			String b = sc.nextLine().trim();
			//int res = lcs(a, b, a.length() - 1, b.length() - 1);
			int res = lcs(a,b);
			System.out.println(res);
		}
		sc.close();
	}
	public static int lcs(String a, String b, int i, int j){
		if(i < 0 || j < 0)
			return 0;
		if(a.charAt(i) == b.charAt(j))
			return lcs(a, b, i-1, j-1) + 1;
		else
			return Math.max(lcs(a, b, i, j-1), lcs(a, b, i-1, j));
	}
	public static int lcs(String a, String b){
		int m = a.length();
		int n = b.length();
		int[][] dp = new int[m+1][n+1];
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				if(a.charAt(i-1) == b.charAt(j-1))
					dp[i][j] = dp[i-1][j-1] + 1;
				else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}

}
