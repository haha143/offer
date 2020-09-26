package offer;

import java.util.ArrayList;


public class num57_finish {
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;
	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	ArrayList<TreeLinkNode>list=new ArrayList<TreeLinkNode>();
	//�����������
	public void Print(TreeLinkNode pNode)
    {
		if(pNode.left!=null)
			Print(pNode.left);
        list.add(pNode);
        if(pNode.right!=null)
        	Print(pNode.right);
    }
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		TreeLinkNode node=new TreeLinkNode(pNode.val);
		if(pNode.left!=null)
			node.left=pNode.left;
		if(pNode.right!=null)
			node.right=pNode.right;
		//˵����ǰ�ڵ㲻�Ǹ��ڵ�
		if(pNode.next!=null)
		{
			node.next=pNode.next;
			while(node.next!=null)
			{
				node=node.next;
			}
			
		}
		//��ǰ�ڵ��Ѿ��Ǹ��ڵ�
        Print(node);
        for(int i=0;i<list.size()-1;i++)
        {
        	if(list.get(i).val==pNode.val)
        		return list.get(i+1);
        }
        return null;
    }
}
