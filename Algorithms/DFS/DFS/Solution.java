package DFS;
import java.util.*;
public class Solution {
	public ArrayList<Integer> dfs(TreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stk = new Stack<TreeNode>();
		if(root != null) 
			stk.push(root);
		while(!stk.isEmpty()){
			TreeNode cur = stk.pop();
			result.add(cur.val);
			if(cur.right != null)
				stk.push(cur.right);
			if(cur.left != null)
				stk.push(cur.left);			
		}
		return result;
	}
	public static void main(String[] args){
		//Integer[] a = {1,null,2};
		//Integer[] a = {};
		Integer[] a = {1,2,5,3,4,null,6};
		TreeNode root = TreeNode.buildTreeFromArray(a);
		Solution sol = new Solution();
		System.out.println(sol.dfs(root).toString());
	}
}
