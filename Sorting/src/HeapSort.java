
public class HeapSort {
	public void heapSort(int[] arr){
		//1: adjust to max heap:
		for(int i=arr.length/2-1;i>=0;i--){
			percolateDown(arr,i,arr.length);
		}
		
		//2:swap & adjust
		for(int i=arr.length-1;i>0;i--){
			swap(arr,0,i);
			percolateDown(arr,0,i);
		}
	}
	
	private void percolateDown(int[] arr,int i, int N){
		int child;
		int temp;
		
		for(temp=arr[i];2*i+1<=N-1;i=child){//
			child=2*i+1;
			if(child!=N-1 && arr[child]<arr[child+1]){
				child++;
			}
			if(temp<arr[child]){
				arr[i]=arr[child];//swap(arr,i,child);
			}
			else{
				break;
			}
		}
		arr[i]=temp;
	}
	
	private void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
