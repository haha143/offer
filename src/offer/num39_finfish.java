package offer;

import java.util.LinkedList;
import java.util.Queue;


//输入一棵二叉树,判断该二叉树是否是平衡二叉树。
//在这里,我们只需要考虑其平衡性,不需要考虑其是不是排序二叉树
public class num39_finfish {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	public int TreeDepth(TreeNode root) {
		int count=0;
        Queue<TreeNode> queue1=new LinkedList<TreeNode>();
        Queue<TreeNode> queue2=new LinkedList<TreeNode>();
        if(root==null)
        	return 0;
        queue2.add(root);
        while(!queue2.isEmpty())
        {   
        	count++;
        	for(TreeNode node:queue2)
        		queue1.add(node);
        	queue2.clear();
        	for(TreeNode node:queue1)
        	{
        		if(node.left!=null)
        			queue2.add(node.left);
        		if(node.right!=null)
        			queue2.add(node.right);
        	}
        	queue1.clear();
        }
        return count;
    }
	 public boolean IsBalanced_Solution(TreeNode root) 
	 {
		 if(root==null)
	        	return true;
	        int cha=Math.abs(TreeDepth(root.left)-TreeDepth(root.right));
	        if(cha>1)
	        	return false;
	        if(root.left!=null)
	        	IsBalanced_Solution(root.left);
	        if(root.right!=null)
	        	IsBalanced_Solution(root.right);
	        return true;
	        
	 }
}
