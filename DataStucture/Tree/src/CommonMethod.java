import java.util.*;


public class CommonMethod {
	//1:preOrder:
	public List<Integer> preOrder(TreeNode root){
		List<Integer> res=new ArrayList<>();
		
		preOrder(root,res);
		
		return res;
	}
	public void preOrder(TreeNode root,List<Integer> list){
		if(root==null)
			return;
		list.add(root.val);
		preOrder(root.left,list);
		preOrder(root.right,list);
	}
	
	//2:inOrder:
	public List<Integer> inOrder(TreeNode root){
		List<Integer> res=new ArrayList<>();
		
		inOrder(root,res);
		
		return res;
	}
	public void inOrder(TreeNode root,List<Integer> res){
		if(root==null)
			return;
		inOrder(root.left,res);
		res.add(root.val);
		inOrder(root.right,res);
	}
	
	//3:postOrder:
	
	//4:binaryTreePath:
	public List<List<Integer>> binaryTreePath(TreeNode root){
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> item=new ArrayList<>();
		
		helper(root,item,res);
		
		return res;
	}
	public void helper(TreeNode root,List<Integer> item,List<List<Integer>> res){
		if(root==null)
			return;
		
		if(root.left==null && root.right==null){
			item.add(root.val);
			res.add(item);
			item.remove(root.val);
			return;
		}
		
		item.add(root.val);
		
		helper(root.left,item,res);
		
		helper(root.right,item,res);
		
		item.remove(root.val);
	}
	
	//5:treeHeight:
	public int getHeight(TreeNode root){
		if(root==null){
			return 0;
		}
		if(root.left==null && root.right==null  ){
			return 1;
		}
		return Math.max(getHeight(root.left),getHeight(root.right))+1;
	}
	
	//6: binarySearch
	public TreeNode binarySearch(TreeNode root,int key){
		if(root==null){
			return null;
		}
		if(root.val==key){
			return root;
		}
		else if(key>root.val){
			return binarySearch(root.right,key);
		}
		else{
			return binarySearch(root.left,key);
		}
	}
	
	public TreeNode deleteNode(TreeNode root,int key){
		if(root.val==key){
			if(root.left==null && root.right==null){
				return null;
			}
			else if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}
			
			TreeNode rightMin=findMin(root.right);
			root.val=rightMin.val;
			root.right=deleteNode(root.right,rightMin.val);
			
			return root;
		}
		else if(root.val>key){
			root.left=deleteNode(root.left,key);
			return root;
		}
		else{
			root.right=deleteNode(root.right,key);
			return root;
		}		
	}
	
	public TreeNode findMin(TreeNode root){
		TreeNode node=root;
		while(node.left!=null){
			node=node.left;
		}
		return node;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}