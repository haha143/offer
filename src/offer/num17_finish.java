package offer;

//�������ö�����A��B��
//�ж�B
//�ǲ���A
//���ӽṹ��
//����Լ��������������һ�������ӽṹ
public class num17_finish {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean flag=false;
		if(root1==null||root2==null)
			return false;
		if(root1.val==root2.val)
			flag=hasroot(root1, root2);
		if(!flag) 
			flag=HasSubtree(root1.left, root2);
		if(!flag) 
			flag=HasSubtree(root1.right, root2);
		return flag;
    }
	public boolean hasroot(TreeNode root1,TreeNode root2)
	{
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		return hasroot(root1,root2)&&hasroot(root1.left, root2.left)&&hasroot(root1.right, root2.right);
	}
}
