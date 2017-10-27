import java.util.Scanner;


public class FindKthNum {

	public static int getKth(int[] a, int k) throws Exception{
		if(a == null)
			throw new NullPointerException("Null array");
		if(k > a.length)
			throw new IllegalArgumentException("k is bigger than array length");
		MinHeap heap = new MinHeap(k);
		for(int i : a){
			if(heap.size < k || i > heap.peek())
				heap.push(i);
		}		
		return heap.pop();
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int res = getKth(a, k);
			System.out.println(res);
		}
		sc.close();
	}

}
class MinHeap{
	int[] a;
	int size = 0;
	public MinHeap(int n){
		a = new int[n];
	}
	public void push(int x){
		if(size < a.length){
			a[size++] = x;
			swap(a, 0, size-1);
			sink(a, 0);
		}
		else{
			a[0] = x;
			sink(a, 0);
		}
	}
	public int peek() throws Exception{
		if(size == 0)
			throw new Exception("Empty Heap");
		return a[0];
	}
	public int pop(){
		if(size == 0)
			try {
				throw new Exception("Empty Heap");
			} catch (Exception e) {				
				e.printStackTrace();
			}
		int x = a[0];		
		a[0] = a[--size];
		sink(a, 0);
		return x;
	}
	public void sink(int[] nums, int i){
		int j = 2*i+1;
		while(j < size){
			if(j+1 < size && a[j+1] < a[j]){
				j++;
			}
			if(a[j] < a[i]){
				swap(a, i, j);
				i = j;
				j = 2*i+1;
			}
			else{
				break;
			}			
		}
	}
	public void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
