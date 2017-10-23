package Sort;
public class MergeSort{
	public void mergeSort(int[] a){
		mSort(a, 0, a.length-1);
	}
	void mSort(int[] a, int start, int end){
		if(start >= end) return;
		int middle = start + (end - start)/2;
		mSort(a,start,middle);
		mSort(a,middle+1,end);
		merge(a,start,middle,end);
	}
	void merge(int[] a, int lo, int mid, int hi){
		int[] aux = new int[a.length];
		int i = lo;
		int j = mid+1;
		int k = lo;
		while(i <= mid && j <= hi)
			aux[k++] = a[i] < a[j]? a[i++]: a[j++];
		while(i <= mid)
			aux[k++] = a[i++];
		while(j <= hi)
			aux[k++] = a[j++];	
		while(lo <= hi)
			a[lo] = aux[lo++];
		return;
	}
	public static void main(String[] args){
		int[] a = {9,0,7,3,2,5,1,4};
		MergeSort sorter = new MergeSort();
		sorter.mergeSort(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
}
