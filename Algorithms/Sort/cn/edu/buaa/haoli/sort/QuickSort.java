package cn.edu.buaa.haoli.sort;
import java.util.Scanner;


public class QuickSort {

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
			qsort(a, 0, a.length-1);
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
	public static void qsort(int[] a, int l, int r){
		if(l >= r)
			return;
		int p = partition(a,l,r);
		qsort(a, l, p-1);
		qsort(a, p+1, r);
	}
	public static int partition(int[] a, int l, int r){
		//randomized
		double rand = Math.random();
		int index = (int)(l+(l-r)*rand);
		swap(a, index, r);
		
		int x = a[r];
		int i = l-1;
		for(int j = l; j < r; j++){
			if(a[j] < x){
				i += 1;
				swap(a, i, j);
			}
		}
		swap(a, i+1, r);
		return i+1;
	}
	public static void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
