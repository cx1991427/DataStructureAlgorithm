import java.util.*;
import java.util.Arrays;

public class Test {
	public static void main (String[] args){
		String[] arr={"cao","ate","eat"};
		
		char[] charArray=arr[0].toCharArray();
		Arrays.sort(charArray);
		String sortedString=new String(charArray);
		
		System.out.println(sortedString);
		System.out.println(arr[0]);
		
		List<List<Integer>> res=new ArrayList<>();
		
	}
}
