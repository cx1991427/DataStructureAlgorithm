import java.net.*;
import java.io.*;

public class Client2{
	public static void main(String[] args){
		try{
			Socket client=new Socket("127.0.0.1",8086);
			
			//get input from keyboard
			BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
			
			PrintStream out=new PrintStream(client.getOutputStream());
			BufferedReader buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			boolean flag=true;
			while(flag){
				System.out.print("input message:");
				String str=input.readLine();
				out.println(str);
				
				String echo=buf.readLine();
				System.out.println(echo);
			}
			
			input.close();
			client.close();
			
		}catch(Exception e){
			
		}
	}
}
