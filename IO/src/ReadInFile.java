import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadInFile {
	public static void main(String[] args){
//		1: Scanner, read from console
		
		 Scanner scanner=new Scanner(System.in);
		 
		 //(1)read string
		    System.out.println("input string:");
		    String str=scanner.nextLine();
		    
		 //(2)read integer
		    System.out.println("input integer:");
		    int i=scanner.nextInt();
		    
		    System.out.println(str+i);
		
		    
		    
//		2:BufferedReader, read integer from file
	    try{
	    	BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			String line = br.readLine();
			
		    while (line != null) {
		    	System.out.println(line);
		    	String[] arr=line.split(" ");
		    	System.out.println(Integer.parseInt(arr[0]));
		    	
		        line = br.readLine();
		    }
	    }catch(Exception e){
	    	System.out.println(e);
	    }
	}
}