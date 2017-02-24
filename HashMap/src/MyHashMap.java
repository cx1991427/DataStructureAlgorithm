public class MyHashMap<K,V>{
  private int N=101;
  private Entry<K,V>[] arr;
  
  class Entry<K,V>{
	  private K key;
	  private V value;
	  private Entry<K,V> next;

	  public Entry(K key, V value){
		this.key=key;
		this.value=value;
		this.next=null;
	  }
  }

//  constructor:
  public MyHashMap(){
	arr=new Entry[N];
  }
  
  // void put(K key,V value)
  public void put(K key,V value){
	int idx=hash(key);
	if(arr[idx]==null){
		arr[idx]=new Entry<K,V>(key,value);
	}
	else{
		Entry<K,V> cur=arr[idx];
		Entry<K,V> pre=null;
		while(cur!=null){
			if(cur.key.equals(key)){
				if(pre==null){
					Entry<K,V> node=new Entry<K,V>(key,value);
					arr[idx]=node;
					node.next=cur.next;
					return;
				}
				else{
					Entry<K,V> node=new Entry<K,V>(key,value);
					node.next=cur.next;
					pre.next=node;
					return;
				}
			}
			pre=cur;
			cur=cur.next;
		}
		pre.next=new Entry<K,V>(key,value);
	}
  }
  
  
  
//  
  public int hash(K key){
	  int idx=key.hashCode()%N;
	  if(idx<0){
		  idx=idx+N;
	  }
	  return idx;
  }
  
}

