package cn.edu.buaa.haoli.dp;
import java.util.ArrayList;
import java.util.Scanner;


public class IntervalMerge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			ArrayList<Pair> list = new ArrayList<Pair>();
			for(int i = 0; i < n; i++){
				int l = sc.nextInt();
				int r = sc.nextInt();
				list.add(new Pair(l,r));
			}
			ArrayList<Pair> res = new ArrayList<Pair>();
			res = mergeInterval(list);
			int count = countPoints(res);
			System.out.println(m+1-count);			
		}
		sc.close();
	}
	public static int countPoints(ArrayList<Pair> list){
		int count = 0;
		for(Pair p : list){
			count += p.right - p.left + 1;
		}
		return count;
	}
	public static ArrayList<Pair> mergeInterval(ArrayList<Pair> list){
		ArrayList<Pair> res = new ArrayList<Pair>();
		if(list.size() != 0){
			Pair cur = new Pair(list.get(0));
			for(int i = 1; i < list.size(); i++){
				if(inter(cur, list.get(i))){
					cur = merge(cur, list.get(i));
				}
				else{
					res.add(cur);
					cur = list.get(i);
				}
			}
			res.add(cur);
		}
		return res;
	}
	public static Pair merge(Pair a, Pair b){
		Pair res = new Pair(a);
		res.left = Math.min(a.left, b.left);
		res.right = Math.max(a.right, b.right);
		return res;
	}
	public static boolean inter(Pair a, Pair b){
		if(a.left < b.left && a.right < b.left)
			return false;
		if(b.left < a.left && b.right < a.left)
			return false;
		return true;
	}
}
class Pair implements Comparable<Pair>{
	public int left;
	public int right;
	public Pair(int left, int right){
		this.left = left;
		this.right = right;
	}
	public Pair(Pair p){
		this.left = p.left;
		this.right = p.right;
	}

	public int compareTo(Pair o) {
		
		if(this.left < o.left)
			return -1;
		if(this.left > o.left)
			return 1;
		return 0;
	}	
}
