package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class num24_finish {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	static Comparator<ArrayList<Integer>> comparator = new Comparator<ArrayList<Integer>>() {
		public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
			// TODO Auto-generated method stub
			return o2.size() - o1.size();
		}
	};
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)return result;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        target += root.val;
        Collections.sort(result, comparator);
        return result;
    }
}
