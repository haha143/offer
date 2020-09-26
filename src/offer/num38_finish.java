package offer;

import java.util.LinkedList;
import java.util.Queue;

//����һ�ö�������
//���������ȡ�
//�Ӹ���㵽Ҷ������ξ����Ľ��
//����,Ҷ���
//�γ�����һ��·����
//�·���ĳ���Ϊ�������
public class num38_finish {
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
}
