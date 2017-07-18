package FindFirstCommonNode;

public class Solution {
public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int m = 0;
		int n = 0;
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while(p1 != null){
			p1 = p1.next;
			m++;
		}
		while(p2 != null){
			p2 = p2.next;
			n++;
		}
		p1 = pHead1;
		p2 = pHead2;
		m = m - n;
		if(m > 0){			
			while(m > 0){
				p1 = p1.next;
				m--;
			}
		}
		else{
			while(m < 0){
				p2 = p2.next;
				m++;
			}
		}
		
		while(p1 != null && p2 != null && p1.val != p2.val){
			p1 = p1.next;
			p2 = p2.next;
		}
		if(p1 == null || p2 == null)
			return null;
		return p1;
    }
	public static void main(String[] args){
		int[] a = {1,2,10};
		int[] b = {3,8,9,4};
		ListNode pHead1 = buildListFromArray(a);
		ListNode pHead2 = buildListFromArray(b);
		Solution solver = new Solution();
		ListNode res = solver.FindFirstCommonNode(pHead1, pHead2);
		if(res == null)
			System.out.println("{}");
		else
			System.out.println(res.val);
	}
	static ListNode buildListFromArray(int[] a){
		int len = a.length;
		ListNode head = new ListNode(0);
		ListNode p = head;
		for(int i = 0; i < len; i++){
			p.next = new ListNode(a[i]);
			p = p.next;
		}
		return head.next;
	}
}
