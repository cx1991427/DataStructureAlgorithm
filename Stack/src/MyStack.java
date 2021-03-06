
public class MyStack {
	public static class ListNode{
		public int val;
		public ListNode next;
		
		public ListNode(int x){
			this.val=x;
		}
	}
	
	public ListNode top;
	
	public void push(int data){
		ListNode newNode=new ListNode(data);
		
		if(top==null){
			top=newNode;
		}
		else{
			newNode.next=top;
			top=newNode;
		}
	}
	
	public boolean pop(){
		if(top==null){
			return false;
		}
		else{
			ListNode temp=top;
			top=top.next;
			temp.next=null;
			return true;
		}
	}
	
	public int peek(){
		if(top==null){
			return -1;
		}
		else{
			return top.val;
		}
	}
	
	public boolean isEmpty(){
		if(top==null){
			return true;
		}
		return false;
	}
}
