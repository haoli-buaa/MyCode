package cn.edu.buaa.haoli.dp;
import java.util.Scanner;


public class Flip {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		boolean res = flipArray(a);
		System.out.println(res);
		sc.close();
	}
	public static boolean flipArray(int[] a){
		int l = -1;
		int r = -1;
		for(int i = 1; i < a.length; i++){
			if(a[i] == a[i-1])
				return false;
			if(a[i] < a[i-1]){
				l = i-1;
				break;
			}	
		}
		if(l != -1){
			for(int i = l+1; i < a.length; i++){
				if(a[i] == a[i - 1])
					return false;
				if(a[i] < a[i-1])
					r = i;
			}
			for(int i = r+1; i < a.length; i++){
				if(a[i] <= a[i-1])
					return false;
			}
			if((l == 0 || a[r] > a[l-1]) && (r == a.length-1 || a[l] < a[r+1]))
				return true;
		}
		return false;
	}	
}
