import java.util.Scanner;


public class FindMissing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int res = findMiss(a);
			System.out.println(res);
		}
	}
	public static int findMiss(int[] a){
		int l = 0;
		int r = a.length-1;
		while(l < r){
			int m = l + (r-l)/2;
			if(a[m] == m+1)
				l = m + 1;
			else{
				r = m;
			}
		}
		return a[a.length-1] == a.length ? a.length+1 : a[l]-1;
	}
	

}
