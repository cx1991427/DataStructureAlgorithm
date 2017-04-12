import java.util.*;



public class Test {
	public static void main(String[] args){
		TreeNode n1=new TreeNode(5);
		TreeNode n2=new TreeNode(3);
		TreeNode n3=new TreeNode(6);
		TreeNode n4=new TreeNode(2);
		TreeNode n5=new TreeNode(4);
		
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		
		CommonMethod cm=new CommonMethod();
		System.out.println(	cm.binarySearch(n1, 4).val);
	}
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val){
		this.val=val;
	}
}