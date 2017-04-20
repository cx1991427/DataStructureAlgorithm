import java.net.*;
import java.io.*;

public class Server{
	public static void main(String[] args){
		try{
			ServerSocket server=new ServerSocket(8086);
			Socket connectionSocket=null;
			
			boolean flag=true;
			int ctn=0;
			
			while(flag){
				connectionSocket=server.accept();
				ctn++;
				System.out.println(ctn+"th client just connected!");
				
				new Thread(new ServerThread(connectionSocket)).start();
			}
			
			server.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
