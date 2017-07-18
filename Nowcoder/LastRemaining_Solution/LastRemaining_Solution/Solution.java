package LastRemaining_Solution;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
    	if(n <= 0 || m <= 0)
            return -1;
        //构建环形链表
    	ListNode head = new ListNode();
    	ListNode cur = head;
    	for(int i = 0; i < n; i++){
    		cur.next = new ListNode(i);
    		cur = cur.next;    		
    	}
    	cur.next = head.next;
    	cur = head.next;
    	//检测自环
    	while(cur.next != cur){
    		for(int i = 0; i < m-1; i++){
    			cur = cur.next;
    		}
    		//删除m-1
    		cur.value = cur.next.value;
    		cur.next = cur.next.next;
    	}
    	return cur.value;
    }
    public static void main(String[] args){
    	//int n = 5, m = 3;
    	int n = 10, m = 3;
    	Solution sol = new Solution();
    	System.out.println(sol.LastRemaining_Solution(n, m));
    }
    class ListNode{
    	int value;
    	ListNode next = null;
    	public ListNode(){
    		value = 0;
    	}
    	public ListNode(int val){
    		value = val;
    	}
    }
}
