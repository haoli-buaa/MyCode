package cn.edu.buaa.haoli.chapter3;

import java.util.Scanner;

public class Seventeen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] a = new int[n];
			int[] b = new int[m];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < m; i++){
				b[i] = sc.nextInt();
			}
			Node f1 = Node.buildLinkedList(a);
			Node f2 = Node.buildLinkedList(b);
			Node merge = mergeSortedList(f1, f2);
			while(merge != null){
				System.out.print(merge.value+" ");
				merge = merge.next;
			}
		}
		sc.close();
	}
	public static Node mergeSortedList(Node f1, Node f2){
		Node p1 = f1.next;
		Node p2 = f2.next;
		Node fhead = new Node();
		Node cur = fhead;
		while(p1 !=  null && p2 != null){
			if(p1.value < p2.value){
				cur.next = p1;
				cur = cur.next;
				p1 = p1.next;
			}
			else{
				cur.next = p2;
				cur = cur.next;
				p2 = p2.next;
			}
		}
		while(p1 != null){
			cur.next = p1;
			cur = cur.next;
			p1 = p1.next;
		}
		while(p2 != null){
			cur.next = p2;
			cur = cur.next;
			p2 = p2.next;
		}
		return fhead.next;
	}

}
