package cn.edu.buaa.haoli.chapter3;

import java.util.Scanner;

public class Sixteen {

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
			Node fhead = Node.buildLinkedList(a);
			Node rev = reverseLinkedList(fhead);
			while(rev != null){
				System.out.print(rev.value+" ");
				rev = rev.next;
			}
		}
		sc.close();
	}
	public static Node reverseLinkedList(Node fhead){
		Node previous = null;
		Node cur = fhead.next;
		
		while(cur != null){
			Node next = cur.next;
			cur.next = previous;
			previous = cur;
			cur = next;
		}
		return previous;
	}

}
