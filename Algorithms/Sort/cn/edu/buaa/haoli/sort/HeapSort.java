package cn.edu.buaa.haoli.sort;

import java.util.Scanner;

public class HeapSort {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[] tmp = sc.nextLine().split(" ");
			if(tmp.length == 0)
				continue;
			int[] a = new int[tmp.length];
			for(int i = 0; i < a.length; i++){
				a[i] = Integer.parseInt(tmp[i].trim());
			}
			hsort(a);
			for(int i = 0; i < a.length; i++){
				System.out.printf("%d", a[i]);
				if(i != a.length-1)
					System.out.printf(" ", a[i]);
				else{
					System.out.println();
				}
			}
		}
		sc.close();
	}
	public static void hsort(int[] a){
		//construct max heap
		for(int k = a.length/2; k >= 0; k--){
			sink(a, k, a.length);
		}
		for(int N = a.length-1; N > 0; N--){
			swap(a, 0, N);
			sink(a, 0, N);
		}
	}
	public static void sink(int[] a, int k, int N){
		while(2*k+1 < N){
			int j = 2*k + 1;
			if(2*k + 2 < N && a[2*k + 2] > a[2*k + 1])
				j++;
			if(a[k] < a[j]){
				swap(a, k, j);
				k = j;
			}
			else{
				break;
			}
		}
	}
	public static void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
