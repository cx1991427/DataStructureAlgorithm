import java.util.*;

public class MyArray {
	public static void main(String[] args){
		int[] arr={1,2,3};
		Arrays.sort(arr, new Comparator<Integer>(){
			public int compare(Integer e1,Integer e2){
				return e2-e1;
			}
		});
		
		
		for(int i:arr){
			System.out.println(i);
		}
		
	}
}
