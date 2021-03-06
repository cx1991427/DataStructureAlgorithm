import java.io.*;

public class Test {
	public static void main(String[] args){
	
		try{
			BufferedReader br=new BufferedReader(new FileReader("tinyUF.txt"));
			String str=br.readLine();
			int N=Integer.parseInt(str);
			
			WeightedQuickUnionUF uf=new WeightedQuickUnionUF(N);
			str=br.readLine();
			while(str!=null){
				String[] arr=str.split(" ");
				uf.union(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
				str=br.readLine();
			}
			
			System.out.println(uf.isConnected(1, 4));
			System.out.println(uf.isConnected(4, 3));
			System.out.println(uf.isConnected(3, 8));
			System.out.println(uf.isConnected(8, 9));
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
