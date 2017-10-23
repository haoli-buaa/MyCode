package cn.edu.buaa.haoli.chapter3;

import java.util.Scanner;

public class Fourteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			reorder(a);
			for(int i = 0; i < n; i++){
				System.out.print(a[i]);
				if(i != n-1)
					System.out.print(" ");
				else
					System.out.println();
			}
		}
		sc.close();
	}
	public static void reorder(int[] a){
		int i = -1;
		for(int j = 0; j < a.length; j++){
			if((a[j]&1) != 0){
				swap(a, ++i, j);
			}
		}
	}
	public static void swap(int[] a, int i, int j){
		if(i == j)
			return;
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
