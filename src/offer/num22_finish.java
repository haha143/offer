package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上往下打印出二叉树的每个节点，
//同层节点从左至右打印。
public class num22_finish {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		 ArrayList<Integer>list=new ArrayList<Integer>();
		 Queue<TreeNode>queue=new LinkedList<TreeNode>();
		 if(root==null)
			 return list;
		 else 
		 {
			 queue.add(root);
			 while(!queue.isEmpty())
			 {
				 TreeNode node=queue.poll();
				 list.add(node.val);
				 if(node.left!=null)
					 queue.offer(node.left);
				 if(node.right!=null)
					 queue.offer(node.right);
				 
			 }
			 return list;   
		 }
	    }
}
