package cn.edu.buaa.haoli.sort;

public class SelectionSort {
	public void sort(int[] a){
		for(int i = 0; i < a.length-1; i++){
			int min = i;
			for(int j = i+1; j < a.length; j++)
				if(a[j] < a[min])
					min = j;
			swap(a, min, i);
			if(isSorted(a))
				break;
		}
	}
	public void recurSort(int[] a, int start){
		if(start >= a.length-1)
			return;
		getMinRecur(a,start,a.length-1);
		recurSort(a, start+1);
	}
	int getMinRecur(int[] a, int begin, int end){		
		if(end ==begin)
			return a[begin];
		if(a[end] < a[end-1])
			swap(a, end, end-1);
		return getMinRecur(a, begin, end-1);		
	}
	void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	boolean isSorted(int[] a){
		for(int i = 1; i < a.length; i++){
			if(a[i] < a[i-1])
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		//int[] a = {};
		int[] a = {1,5,3,2,4,8,7,2,1};
		//int[] a = {54,57,89,59,90,12,3,45,34,33,22,15};
		SelectionSort ss = new SelectionSort();
		ss.recurSort(a,0);
		//System.out.println(ss.getMinRecur(a, 0, a.length-1));
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
