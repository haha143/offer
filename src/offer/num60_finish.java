package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上到下按层打印二叉树，
//同一层结点从左至右输出。
//每一层输出一行
public class num60_finish {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
		int count=0;
        Queue<TreeNode> queue1=new LinkedList<TreeNode>();
        Queue<TreeNode> queue2=new LinkedList<TreeNode>();
        if(pRoot==null)
        	return list;
        queue2.add(pRoot);
        while(!queue2.isEmpty())
        {   
        	count++;
        	ArrayList<Integer>list1=new ArrayList<Integer>();
        	for(TreeNode node:queue2)
        	{
        		queue1.add(node);
        		list1.add(node.val);
        	}
        	list.add(list1);
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
		return list;
	}
}
