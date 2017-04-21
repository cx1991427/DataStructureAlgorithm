
public class Solution {
	
	//1:	merger sort
	public void mergeSort(int[] arr){
		int[] temp=new int[arr.length];
		mergeSort(arr,temp,0,arr.length-1);
	}
	
	public void mergeSort(int[] arr,int[] temp, int start, int end){
		if(start>=end){
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr,temp,start,mid);
		mergeSort(arr,temp,mid+1,end);
		mergeArray(arr,temp,start,mid,end);
	}
	
	public void mergeArray(int[] arr, int[] temp, int start, int mid, int end){
		int i=start;
		int j=mid+1;
		int k=0;
		
		/*while(){
			if(){
				temp[k]=arr[i];
				i++;
				k++;
			}
			else{
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		
		
		for(k=0;k<;k++ ){
			arr[start]=temp[k+start];
		}*/
		
		
	}
	
	

	//2:  heap sort
	public void heapSort(int[] arr){
		//(1):build max heap from unsorted array, that is, do heapAdjust()  N/2-1 times!!!
		for(int i=arr.length/2-1;i>=0;i--){
			heapAdjust(arr,i,arr.length-1);
		}
		
		//(2):
		for(int i=arr.length-1;i>0;i--){
			swap(arr[0],arr[i]);
			heapAdjust(arr, 0,i);
		}
	}
	
	public void heapAdjust(int[] arr, int i, int n){
		
	}
	
	public void swap(int x,int y){
		
	}
	
}
