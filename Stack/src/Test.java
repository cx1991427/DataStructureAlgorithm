import java.io.*;
import java.util.*;

public class Test {
	public static void main(String[] args){
		BalancedSymbols bs=new BalancedSymbols();
		MyStack stack=new MyStack();
		
		stack.push(2);
		stack.push(3);
		stack.push(5);
		
		stack.push(2);
		stack.push(3);
		stack.push(5);
		
		
		while(!stack.isEmpty()){
			System.out.println(stack.peek());
			stack.pop();
		}
		
		 Scanner scanner=new Scanner(System.in);
		    System.out.println("input string:");
		    String str=scanner.nextLine();
		    
		    System.out.println("input integer:");
		    int i=scanner.nextInt();
		    
		    System.out.println(str+i);
		
	    try{
	    	BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			String line = br.readLine();
			
		    while (line != null) {
		    	System.out.println(line);
		    	System.out.println(bs.isBalanced(str));
		        line = br.readLine();
		    }
	    }catch(Exception e){
	    	System.out.println(e);
	    }
	}
}
