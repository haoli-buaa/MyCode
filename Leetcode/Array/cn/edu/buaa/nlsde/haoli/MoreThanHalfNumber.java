package cn.edu.buaa.nlsde.haoli;

import java.util.Scanner;

public class MoreThanHalfNumber {

	public static int findMTHN(int[] a){
		int count = 0;
		int res = 0;
		for(int i = 0; i < a.length; i++){
			if(count == 0){
				res = a[i];
				count = 1;
			}
			else{
				if(a[i] == res)
					count++;
				else
					count--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(findMTHN(a));
		}
		sc.close();
	}

}
