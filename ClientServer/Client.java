import java.awt.*;
import java.awt.event.*;
import java.io.PrintWriter;
import java.net.*;
import javax.swing.*;

public class Client extends JFrame{
	//1:
	private JTextField tf;
	private JTextArea ta;
	PrintWriter writer;
	 Socket clientSocket;
	
	//2:
	public Client(String title){
		super(title);
		
		Container container=this.getContentPane();
		tf=new JTextField();
		ta=new JTextArea();
		container.add(tf,"South");
		container.add(ta,"Center");
		
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String str=tf.getText();
				
				ta.append(str+"\n");
				writer.println(str);
				tf.setText("");
			}
		});
	}
	
	//3:
	public void connect(){
		ta.append("connecting to Server..."+"\n");
		try{
			clientSocket=new Socket("127.0.0.1",8888);
			writer=new PrintWriter(clientSocket.getOutputStream(),true);
			ta.append("Connected to server!"+"\n");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public static void main (String[] args){
		Client client=new Client("Client Side");
		
		client.setVisible(true);
		client.setSize(600,800);
		
		client.connect();
	}
}






