import java.io.*;
import java.net.*;
import java.util.*;

public class Test extends Thread{
	
	public static void main(String[] args){
		
		RandomListNode node1=new RandomListNode(1);
		RandomListNode node2=new RandomListNode(2);
		RandomListNode node3=new RandomListNode(3);
		RandomListNode node4=new RandomListNode(4);
		
		RandomListNode duplicate1=new RandomListNode(node1.label);
		
		RandomListNode[] arr2=new RandomListNode[3];
		arr2[0]=node1;
		arr2[1]=node2;
		arr2[2]=node3;
	
		PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
			public int compare(ListNode n1,ListNode n2){
				return n1.val-n2.val;
			}
		});
		
		Scanner scanner=new Scanner(System.in);
//		int i=scanner.nextInt();
		String str=scanner.nextLine();
		System.out.println(str);
	}
}





