import java.util.*;

public class Solution {
   public List<Integer> bfs(Node root){
	   List<Integer> res=new ArrayList<>();
	   
	   if(root==null){
		   return res;
	   }
	   helper(root,res);
	   
	   
	   return res;
   }
   
   public void helper(Node node,List<Integer> res){
	   LinkedList<Integer> queue=new LinkedList<>();
	   queue.add(node.val);
	   
   }
}
class Node{
	int val;
	LinkedList[] adf;
}