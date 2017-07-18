package LastCommonNode;

import java.util.*;

public class TreeNode {
   int value;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { value = x; }
   public static TreeNode buildTreeFromArray(Integer[] a){
		int len = a.length;
		TreeNode root = null;
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		if(len > 0){
			root = new TreeNode(a[0]);
			que.offer(root);
		}
		int i = 1;
		while(!que.isEmpty() && i < len){
			TreeNode cur = que.poll();
			if(a[i] != null){
				cur.left = new TreeNode(a[i]);
				que.offer(cur.left);
			}
			if(i+1 < len && a[i+1] != null){
				cur.right = new TreeNode(a[i+1]);
				que.offer(cur.right);
			}
			
			i += 2;
		}
		return root;
	}
   public static void main(String[] args){
	   Integer[] a = {1,2,5,3,4,null,6};
	   //Integer[] a = {};
	   //Integer[] a = {1,null,2,3};
	   TreeNode root = TreeNode.buildTreeFromArray(a);//error
	   if(root != null)
		   System.out.println(root.value);
   }
}
