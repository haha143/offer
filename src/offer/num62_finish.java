package offer;

import java.util.ArrayList;

public class num62_finish {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	ArrayList<TreeNode>list=new ArrayList<TreeNode>();
	public void Print(TreeNode pRoot)
    {
		if(pRoot.left!=null)
			Print(pRoot.left);
        list.add(pRoot);
        if(pRoot.right!=null)
        	Print(pRoot.right);
    }
	
	TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(pRoot==null)
			return null;
        Print(pRoot);
        if(k>list.size()||k==0)
        	return null;
        return list.get(k-1);
    }

}
