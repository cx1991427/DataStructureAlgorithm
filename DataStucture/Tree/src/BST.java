
public class BST {		//class BST<T extends Comparable<T> >
	//1: 
	public static class TreeNode{
		public int val;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode(int x){
			this.val=x;
		}
	}
	
	//2:
	public TreeNode root;
	
	//3:
	public BST(){
		root=null;
	}
	
	public BST(int x){
		root=new TreeNode(x);
	}
	
	//4:	
	public void insert(int x){
		
	}
	
	public boolean contains(int x){
		return false;
	}
	
	public int findMin(){
		return -1;
	}
	
	public int findMax(){
		return 1;
	}
	
	public void remove(int x){
		
	}
	
	
	public boolean contains(int x,TreeNode node){
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
	
	public TreeNode findMin(TreeNode node){
		if(node==null){
			return null;
		}
		
		if(node.left==null){
			return node;
		}
		
		return findMin(node.left);
	}
	
	public TreeNode findMax(TreeNode node){
		if(node==null){
			return null;
		}
		if(node.right==null){
			return node;
		}
		while(node.right!=null){
			node=node.right;
		}
		return node;
		
	}
	
/*	
 	1 
	2 * Internal method to insert into a subtree.
	3 * @param x the item to insert.
	4 * @param t the node that roots the subtree.
	5 * @return the new root of the subtree.
	6 *//*
	7 private BinaryNode<AnyType> insert( AnyType x, BinaryNode<AnyType> t )
	8 {
	9 if( t == null )
	10 return new BinaryNode<>( x, null, null );
	11
	12 int compareResult = x.compareTo( t.element );
	13
	14 if( compareResult < 0 )
	15 t.left = insert( x, t.left );
	16 else if( compareResult > 0 )
	17 t.right = insert( x, t.right );
	18 else
	19 ; // Duplicate; do nothing
	20 return t;
	21 }
*/
	
}
