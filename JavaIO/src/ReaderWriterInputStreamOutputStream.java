import java.io.*;

public class ReaderWriterInputStreamOutputStream {
	public static void main(){
		File file=new File("1.txt");
		
		try{
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			
			for(int i=0;i<10;i++){
				bw.write("I am "+i+"th line!");
				bw.newLine();
			}
			
			bw.close();
			fw.close();
			
		}catch(Exception e){
			
		}
	}
}
