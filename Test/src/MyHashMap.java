
public class MyHashMap {
	public int N;
	public MapNode[] arr;
	
	public MyHashMap(){
		arr=new MapNode[N];
	}
	
	public void put(int key,int value){
		
	}
	
	public int get(int key){
		return -1;
	}
	
	public boolean contansKey(int key){
		return true;
	}
	
	public void remove(int key){
		
	}
}
class MapNode{
	int key;
	int value;
	MapNode next;
	
	MapNode(int key, int value){
		this.key=key;
		this.value=value;
		next=null;
	}
}
