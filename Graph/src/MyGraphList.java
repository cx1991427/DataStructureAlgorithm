
public class MyGraphList {
	public MyLinkedList[] arr;
	
	public MyGraphList(int V){
		arr=new MyLinkedList[V];
	}
	
	public void addEdge(int V,int W){
		arr[V]=new MyLinkedList();
		arr[V].add(W);
	}
	
	public MyLinkedList adj(int V){
		return arr[V];
	}
}
