import java.net.*;
import java.io.*;

public class ServerThread implements Runnable {
	private Socket connectionSocket;
	
	public ServerThread(Socket connectionSocket){
		this.connectionSocket=connectionSocket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			PrintStream out=new PrintStream(connectionSocket.getOutputStream());
			BufferedReader buf = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			
			boolean flag=true;
			while(flag){
				String str=buf.readLine();
				if(str.equals("bye")){
					flag=false;
				}
				out.println("echo"+str);
			}
			
			out.close();
			connectionSocket.close();
		}catch(Exception e){
			System.out.println("exception occured!");
		}
	}
}
