package cn.edu.buaa.nlsde.haoli;

import java.util.Scanner;

public class RotateArray {

	public static int find(int[] a, int x){
		int l = 0;
		int r = a.length-1;
		int offset = findMin(a);
		while(l <= r){
			int mid = l + (r-l)/2;
			int real = (mid+offset)%a.length;
			if(a[real] == x)
				return real;
			else{
				if(a[real] > x)
					r = mid - 1;
				else
					l = mid + 1;
			}
		}
		return -1;
	}
	public static int findMin(int[] a){
		int l = 0;
		int r = a.length-1;
		if(a[l] < a[r])
			return 0;
		while(l < r){
			int m = l + (r-l)/2;
			if(a[m] == a[0] && a[m] == a[a.length-1])
				return findMinInOrder(a, l, r);
			if(a[m] > a[a.length-1])
				l = m+1;
			else{
				r = m;
			}
		}
		return l;
	}
	public static int findMinInOrder(int[] a, int l, int r){
		int res = l;
		for(int i = l+1; i <= r; i++){
			if(a[i] <= a[res] && a[i] < a[i-1])
				res = i;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(find(a,x));
		}
		sc.close();
	}

}
