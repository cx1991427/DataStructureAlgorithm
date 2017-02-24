
public class Shape {
	public int side;
	public char flag;
	
	private Shape(){
		this(10,'A');
	}
	
	private Shape(int side,char ch){
		this.side=side;
		this.flag=ch;
	}
	
	
}
