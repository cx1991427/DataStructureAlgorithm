
public class WeightedQuickUnionUF {
	//1:instance variable
	private int[] arr;		//arr[i]: parent of object i
	private int[] size;		//size[i]:# of objects 
	
	//2:constructor
	public WeightedQuickUnionUF(int N){
		arr=new int[N];
		size=new int[N];
		
		for(int i=0;i<N;i++){
			arr[i]=i;
		}
		
//		for(int i=0;i<N;i++){
//			size[i]=1;
//		}
	}
	
	//1: find
	public boolean isConnected(int p,int q){
		return ancestor(p)==ancestor(q);
	}
	
	//2: union
	public void union(int p,int q){
		int i=ancestor(p);
		int j=ancestor(q);
		if(i==j){
			return;
		}
		if(size[i]<size[j]){
			arr[i]=j;
			size[j]+=size[i];
		}
		else{
			arr[j]=i;
			size[i]+=size[j];
		}
	}
	
	private int ancestor(int i){
		while(i!=arr[i]){
			arr[i]=arr[arr[i]];//can be omitted: path compression
			i=arr[i];
		}
		return i;
	}
}
