import java.io.*;
import java.net.*;
import java.util.*;

public class Test{
	
	public static void main(String[] args){
		
		
		
		String str="xiangcao";
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='i'){
				arr[i]='#';
			}
		}
		
		System.out.println(arr[1]);
	}
}






