package offer;

//���������Ķ�������
//����任ΪԴ�������ľ���
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
