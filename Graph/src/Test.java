//import java.util.HashMap;
//import java.util.List;
//
//public class Test {
//	public static void main(String[] args){
//		UndirectedGraphNode root=new UndirectedGraphNode(0);
//		UndirectedGraphNode node1=new UndirectedGraphNode(1);
//		
//		UndirectedGraphNode node2=new UndirectedGraphNode(2);
//		UndirectedGraphNode node3=new UndirectedGraphNode(3);
//		
//		root.neighbors.add(node1);
//		root.neighbors.add(node3);
//		
//		node1.neighbors.add(root);
//		node1.neighbors.add(node2);
//		
//		node2.neighbors.add(node1);
//		node2.neighbors.add(node3);
//		
//		node3.neighbors.add(root);
//		node3.neighbors.add(node2);
//		
//		
//		CommonMethod cm=new CommonMethod();
//		
//		List <UndirectedGraphNode> res=cm.dfs(root);
//		System.out.println(cm.dfs(root).size());
//		
//		for(UndirectedGraphNode node:res){
//			System.out.println(node.label);
//		}
//		
//		List<UndirectedGraphNode> res2=cm.bfs(root);
//		for(UndirectedGraphNode node:res2){
//			System.out.println(node.label);
//		}
//		
//		
//	}
//}
