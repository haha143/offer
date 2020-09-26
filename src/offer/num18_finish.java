package offer;

//操作给定的二叉树，
//将其变换为源二叉树的镜像
public class num18_finish {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	public void Mirror(TreeNode root) {
		if(root==null)
			return;
		TreeNode node=root.left;
		root.left=root.right;
		root.right=node;
		Mirror(root.left);
		Mirror(root.right);
    }
}
