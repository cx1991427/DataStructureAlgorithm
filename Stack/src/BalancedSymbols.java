import java.util.*;

public class BalancedSymbols {
	public boolean isBalanced(String str){
		Stack<Character> stack=new Stack<>(); 
		for(int i=0;i<str.length();i++){
			//left parts,push
			if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
				stack.push(str.charAt(i));
			}
			//right parts,pop
			else{
				if(stack.isEmpty()){
					return false;
				}
				else{
					if(stack.pop()=='('){
						if(str.charAt(i)!=')'){
							return false;
						}
					}
					else if(stack.pop()=='['){
						if(str.charAt(i)!=']'){
							return false;
						}
					}
					else{
						if(str.charAt(i)!='}'){
							return false;
						}
					}
				}
				
			}
		}
		
		if(stack.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
}
