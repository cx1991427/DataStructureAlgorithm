import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
	
	public static class ListNode<T>{
		public T val;
		public ListNode<T> next;
		
		public ListNode(){	//public ListNode<T>(){}
			this.val=null;
			this.next=null;
		}
		
		public ListNode(T val, ListNode<T> next){
			this.val=val;
			this.next=next;
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}



/*public class MyLinkedList {
	//1: inner class
	public static class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int x){
			this.val=x;
		}		
	}
	
	//2: instance variable
	public int size;
	public ListNode dummy;
	public ListNode cur;
	
	//3: constructor
	public MyLinkedList(){
		size=0;
		dummy=new ListNode(-1);
		cur=dummy;
	}
	
	public void add(int val){
		cur.next=new ListNode(val);
		cur=cur.next;
		
		size++;
	}
	
	public void remove(){
		
		
		size--;
	}
		
}*/