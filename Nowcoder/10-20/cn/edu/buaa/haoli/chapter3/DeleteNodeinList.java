package cn.edu.buaa.haoli.chapter3;

public class DeleteNodeinList {
	public static void main(String[] args){
		Node head = new Node();
		Node cur = head;
		Node x = new Node();
		for(int i = 1; i <= 5; i++){
			//获得待删除节点
			if(i == 3)
				x = cur;
			
			cur.next = new Node(i);
			cur = cur.next;
		}
		/*删除尾节点
		x = cur;*/
		Node result = delete(head, x);
		cur = result;
		while(cur != null){
			System.out.println(cur.value);
			cur = cur.next;
		}
	}
	public static Node delete(Node head, Node node){
		Node fhead = new Node();
		fhead.next = head;
		//assume node in list
		if(node.next != null){
			node.value = node.next.value;
			node.next = node.next.next;
		}
		else{
			Node previous = fhead;
			Node cur = head;
			while(cur != node && cur != null){
				cur = cur.next;
				previous = previous.next;
			}			
			previous.next = node.next;
		}
		return fhead.next;
	}
}
class Node{
	int value;
	Node next;
	public Node(){
	}
	public Node(int value){
		this.value = value;
	}
	public Node(int value, Node next){
		this(value);
		this.next = next;
	}		
	static Node buildLinkedList(int[] a){
		Node fhead = new Node();
		Node cur = fhead;
		for(int i = 0; i < a.length; i++){
			cur.next = new Node(a[i]);
			cur = cur.next;
		}
		return fhead;
	}
}
