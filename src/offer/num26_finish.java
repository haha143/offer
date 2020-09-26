package offer;

import java.util.ArrayList;
public class num26_finish {
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
	 public TreeNode Convert(TreeNode pRootOfTree) {
		 if(pRootOfTree==null)
			 return null;
	        Print(pRootOfTree);
	        for(int i=0;i<list.size()-1;i++)
	        {
	        	list.get(i).right=list.get(i+1);
	        	list.get(i+1).left=list.get(i);
	        }
	        return list.get(0);
	    }
}
