
public class BST {		//class BST<T extends Comparable<T> >
	//1: 
	public static class TreeNode{
		int val;
		TreeNode left,right;
		
		public TreeNode(int val){
			this.val=val;
		}
	}
	
	//2:attribute
	public TreeNode root;
	
	//3:constructor
	public BST(){
		root=null;
	}
	public BST(int val){
		root=new TreeNode(val);
	}
	
	//4:insert	
	public void insert(int x){
		insert(x,root);		//root=insert(x);
	}

	private TreeNode insert(int x,TreeNode root){
		if(root==null){
			return new TreeNode(x);
		}
		if(x<root.val){
			root.left=insert(x,root.left);
		}
		else if(x==root.val){
			return root;
		}
		else{
			root.right=insert(x,root.right);
		}
		return root;
	}
	
	//or: complex but straightforward way:
	
//	private void insert(int x,TreeNode node){
//		if(x==node.val){
//			return;
//		}
//		else if(x<node.val){
//			if(node.left==null){
//				node.left=new TreeNode(x);
//				return;
//			}
//			insert(x,node.left);
//		}
//		else{
//			if(node.right==null){
//				node.right=new TreeNode(x);
//				return;
//			}
//			insert(x,node.right);
//		}
//	}
	
	//5:contains:
	public boolean contains(int x){
		return contains(x,root);
	}
	private boolean contains(int x,TreeNode node){
		if(node==null){
			return false;
		}
		
		if(x>node.val){
			return contains(x,node.right);
		}
		else if(x==node.val){
			return true;
		}
		else{
			return contains(x,node.left);
		}
	}
	
	//6:findMin
	public TreeNode findMin(){
		return findMin(root);
	}
	private TreeNode findMin(TreeNode node){
		if(node.left==null){
			return node;
		}
		return findMin(node.left);
	}
	
	
	//7:findMax
	public TreeNode findMax(){
		return findMax(root);
	}
	private TreeNode findMax(TreeNode node){
		while(node.right!=null){
			node=node.right;
		}
		return node;
	}	
	
	//8:delete
	public TreeNode delete(int x){
		return delete(x,root);
	}
	private  TreeNode delete(int x,TreeNode node){
		if(node==null){
			return node;
		}
		
		if(x<node.val){
			node.left=delete(x,node.left);
		}
		else if(x==node.val){
			if(node.left==null && node.right==null){
				return null;
			}
			if(node.left==null){
				return node.right;
			}
			if(node.right==null){
				return node.left;
			}
			//node has left and right child
			TreeNode min=findMin(node.right);
			node.val=min.val;
			delete(min.val,node.right);
		}
		else{//x>node.val
			node.right=delete(x,node.right);
		}
		return node;
	}
}
