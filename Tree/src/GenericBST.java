
public class GenericBST<T extends Comparable<? super T>> {//public class BST<T extends Comparable<T>>{}
	//1: inner class:
	public static class TreeNode<T>{
		T val;
		TreeNode<T> left,right;
		
		public TreeNode(T val){//not: public TreeNode<T>(T val){}
			this.val=val;
		}		
	}
	
	//2:attribute:
	public TreeNode<T> root;
	
	//3:constructor:
	public GenericBST(T val){
		root=new TreeNode<>(val);
	}
	
	//4:Common Method:
	
	
	//5:contains:
	public boolean contains(T val){
		return contains(val,root);
	}
	private boolean contains(T val,TreeNode<T> node){
		if(node==null){
			return false;
		}
		
		if(val.compareTo(node.val)==0){
			return true;
		}
		else if(val.compareTo(node.val)<0){
			return contains(val,node.left);
		}
		else{
			return contains(val,node.right);
		}
	}
	
	
	//6:findMin:
	public TreeNode<T> findMin(){
		return findMin(root);
	}
	private TreeNode<T> findMin(TreeNode<T> node){
		if(root.left==null){
			return node;
		}
		return findMin(node.left);
	}
	
	//7:findMax:
	public TreeNode<T> findMax(){
		return findMax(root);
	}
	private TreeNode<T> findMax(TreeNode<T> node){
		if(node.right==null){
			return node;
		}
		return findMax(node.right);
	}
	
	//8:insert:
	
	
	//9:remove:
}
