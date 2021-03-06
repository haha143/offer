package offer;

import java.util.Arrays;

//根据前序与中序重建二叉树
public class num04_finish {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	public class Solution {
	    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        if(pre.length==0||in.length==0)
	        	return null;
	        TreeNode treeNode=new TreeNode(pre[0]);
	        for(int i=0;i<in.length;i++)
	        {
	        	if(in[i]==treeNode.val)
	        	{
	        		treeNode.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
	        		treeNode.right=reConstructBinaryTree(Arrays.copyOfRange(pre, i, pre.length), Arrays.copyOfRange(in,i+1,in.length));
	        	}
	        }
	        return treeNode;
	    }
	}
	
}
