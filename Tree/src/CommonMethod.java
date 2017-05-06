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
	public List<TreeNode> postOrder(TreeNode root){
		List<TreeNode> list=new ArrayList<>();
		postOrder(root,list);
		return list;
	}
	private void postOrder(TreeNode root, List<TreeNode> list){
		
	}
	
	//levelOrder:
	public List<TreeNode> levelOrder(TreeNode root){
		List<TreeNode> list=new ArrayList<>();
		levelOrder(root,list);
		return list;
	}
	private void levelOrder(TreeNode root,List<TreeNode> list){
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		
		while(!queue.isEmpty()){
			TreeNode node=queue.poll();
			if(node==null){
				if(queue.size()==0){
					break;
				}
				else{
					queue.offer(null);
				}
			}
			else{
				if(node.left!=null){
					queue.offer(node.left);
				}
				if(node.right!=null){
					queue.offer(node.right);
				}
				list.add(node);
			}
		}
	}
	
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
	//7:deleteNode
	public TreeNode deleteNode(TreeNode root,int key){
		
		if(root==null){
			return null;
		}
		
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
	//8:findMin
	public TreeNode findMin(TreeNode root){
		TreeNode node=root;
		while(node.left!=null){
			node=node.left;
		}
		return node;
	}
	//9:getPath ( a path from root node to target node! )
	public List<TreeNode> getPath(TreeNode root,TreeNode targetNode){
		List<TreeNode> res=new ArrayList<>();
		
		getPathHelper(root,targetNode,res);
		
		return res;
	}
	private TreeNode getPathHelper(TreeNode root, TreeNode targetNode, List<TreeNode> res){
		if(root==null){
			return null;
		}
		if(root==targetNode){
			res.add(root);
			return root;
		}
		
		TreeNode left=getPathHelper(root.left,targetNode,res);
		TreeNode right=getPathHelper(root.right,targetNode,res);
		
		if(left==null && right==null){
			return null;
		}
		
		res.add(root);
		return root;
	}
	
	
}
