
public class MyLinkedList<T> {
	
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
	
	public ListNode<T> dummyHead;
}
