import java.io.*;
import java.net.*;
import java.util.*;

public class Test extends Thread{
	
	public static void main(String[] args){
		
		int N=5;
		int[][] arr=new int[N][];

		String str="ABCabc";
		String str2=str.toLowerCase();
		
		System.out.println(str2);
		
		List<Integer>  list=new ArrayList<>();
		list.add(1);;
		list.add(2);
		
		List<Integer>  list2=new ArrayList<>(list);
		list2.add(3);
		
//		list.remove(2);
		
		System.out.println(list2.size());
		
		int[]  arr1=new int[5];
		
		
		System.out.println(arr1.length);
				
		System.out.println(arr1[0]);
		
	}
}





