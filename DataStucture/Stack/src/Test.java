
public class Test {
	public static void main(String[] args){
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
	}
}
