package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class num58_unfinish {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
//	 public boolean isSymmetrical(TreeNode pRoot)
//	 {
//		 if(pRoot.left!=null&&pRoot.right==null)
//			 return false;
//		 if(pRoot.right!=null&&pRoot.left==null)
//			 return false;
//		 if(pRoot.left.val!=pRoot.right.val)
//			 return false;
//		 if(pRoot.left!=null)
//			 isSymmetrical(pRoot.left);
//		 if(pRoot.left!=null)
//			 isSymmetrical(pRoot.right);
//		 return true;
//	 }
	ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
	public void  Print(TreeNode pRoot) {
		int count=0;
        Queue<TreeNode> queue1=new LinkedList<TreeNode>();
        Queue<TreeNode> queue2=new LinkedList<TreeNode>();
        if(pRoot==null)
        	return;
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
		return;
	}
	public boolean panduan(ArrayList<Integer>list)
	{
		for(int i=0;i<list.size()/2;i++)
		{
			if(list.get(i)!=list.get(list.size()-i-1))
				return false;
		}
		return true;
	}
	 public boolean isSymmetrical(TreeNode pRoot)
	 {
		 Print(pRoot);
		 if(list.size()==0||list.size()==1)
			 return true;
		 for(int i=1;i<list.size();i++)
		 {
			 if(list.get(i).size()!=Math.pow(2, i))
				 return false;
			 if(!panduan(list.get(i)))
				 return false;
		 }
		 return true;
	 }
}
