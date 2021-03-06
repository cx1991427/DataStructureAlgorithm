
public class MergeSort {
		
	public void mergeSort(int[] arr){
		int[] temp=new int[arr.length];
		
		mergeSort(arr,temp,0,arr.length-1);
	}
	
	private void mergeSort(int[] arr,int[] temp,int start,int end){
		if(start>=end){
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr,temp,start,mid);
		mergeSort(arr,temp,mid+1,end);
		
		merge(arr,temp,start,mid,end);		
	}
	
	private void merge(int[] arr,int[] temp,int start,int mid,int end){
		int i=start;
		int j=mid+1;
		int k=start;
		
		while(i<=mid && j<=end){
			if(arr[i]<=arr[j]){
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
		while(i<=mid){
			temp[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end){
			temp[k]=arr[j];
			j++;
			k++;
		}
		
		i=start;
		k=start;
		while(i<=end){
			arr[i]=temp[k];
			i++;
			k++;
		}
	}
}