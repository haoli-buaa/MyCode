package cn.edu.buaa.haoli.chapter3;

import java.util.Scanner;

public class Fifteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			Node fhead = Node.buildLinkedList(a);
			Node kth = getKthNode(fhead, k);
			if(kth != null)
				System.out.println(kth.value);
			else
				System.out.println("null");
		}
	}
	public static Node getKthNode(Node fhead, int k){
		Node fast = fhead;
		Node slow = fhead;
		for(int i = 0; i < k; i++){
			fast = fast.next;
			if(fast == null)
				return null;
		}
		while(fast != null){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
		
	}
}
