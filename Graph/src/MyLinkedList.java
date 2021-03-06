
public class MyLinkedList {
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
		ListNode temp=new ListNode(val);
		cur.next=temp;
		cur=cur.next;
		
		size++;
	}
	
	public void remove(){
		
		
		size--;
	}
	
	public void add(int index,int val){
		ListNode temp=new ListNode(val);
		temp.next=dummy.next;
		dummy.next=temp;
		
		size++;
	}
	
	
}
