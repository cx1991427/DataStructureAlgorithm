import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {
	public static void main(String[] args){
		try{
			ServerSocket server=new ServerSocket(80);
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
