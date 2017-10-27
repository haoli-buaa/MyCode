package cn.edu.buaa.haoli.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class BucketSort {
	public int bucketsize = 3;
	public void bsort(int[] a){
		//input check
		if(a == null || a.length == 0)
			return;
		//assumption: uniform distribution a~[min,max]
		int min = a[0];
		int max = a[0];
		int len = a.length;
		for(int i = 1; i < len; i += 2){
			if(i+1 < len && a[i] != a[i+1]){
				if(a[i] > a[i+1]){
					if(a[i] > max)
						max = a[i];
					if(a[i+1] < min)
						min = a[i+1];
				}
				else{
					if(a[i+1] > max)
						max = a[i+1];
					if(a[i] < min)
						min = a[i];
				}
			}
			else{
				if(a[i] > max)
					max = a[i];
				if(a[i] < min)
					min = a[i];
			}
		}
		//create bucket
		int nbucket = (int) Math.ceil(((double)len)/bucketsize);
		ArrayList<DoubleNode> bucket = new ArrayList<DoubleNode>();
		for(int i = 0; i < nbucket; i++){
			bucket.add(null);
		}
		for(int i = 0; i < len; i++){
			int j = (a[i]-min)/bucketsize;
			DoubleNode node = new DoubleNode(a[i]);
			if(bucket.get(j) != null){
				DoubleNode head = bucket.get(j);
				while(head.next != null)
					head = head.next;
				head.next = node;
				node.previous = head;
			}
			else{
				bucket.set(j, node);
			}
		}
		//insertion sort insuide bucket
		for(int i = 0; i < nbucket; i++){
			DoubleNode head = sortLinkedList(bucket.get(i));
			bucket.set(i, head);
		}		
		//write back
		int index = 0;
		for(int i = 0; i < nbucket; i++){
			DoubleNode head = bucket.get(i);
			while(head != null){
				a[index++] = head.value;
				head = head.next;
			}
		}
	}
	public DoubleNode sortLinkedList(DoubleNode head){
		if(head == null || head.next == null)
			return head;
		DoubleNode fhead = new DoubleNode();
		fhead.next = head;
		head.previous = fhead;
		while(head != null && head.previous != null){
			DoubleNode next = head.next;
			DoubleNode prev = head.previous;
			if(head.compareTo(prev) < 0){
				prev.next = next;
				if(next != null)
					next.previous = prev;
				while(prev.previous != null && head.compareTo(prev) < 0){
					prev = prev.previous;		
				}
				head.next = prev.next;
				head.previous = prev;
				prev.next = head;
			}
			head = next;			
		}
		return fhead.next;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			String[] strs = input.split(" ");
			int[] a = new int[strs.length];
			for(int i = 0; i < a.length; i++){
				a[i] = Integer.parseInt(strs[i].trim());
			}
			new BucketSort().bsort(a);
			print(a);
		}
		sc.close();
	}
	public static void print(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]);
			if(i != a.length-1){
				System.out.print(" ");
			}
			else{
				System.out.println();
			}
		}
	}
}
class DoubleNode{
	public int value;
	public DoubleNode previous = null;
	public DoubleNode next = null;
	public DoubleNode(){
		this(0);
	}
	public DoubleNode(int x){
		this.value = x;		
	}
	public int compareTo(DoubleNode other){
		if(this.value > other.value)
			return 1;
		if(this.value == other.value)
			return 0;
		else
			return -1;
	}
}
