import java.util.*;

public class MyGraphMatrix {
	ArrayList<String> vertices;
	int[][] edges;
	
	public MyGraphMatrix(int N){
		vertices=new ArrayList<String>();
		edges=new int[N][N];
	}

	public void insertVertex(String str){
		vertices.add(str);
	}
	
	public void insertEdge(int v1Index,int v2Index, int cost){
		edges[v1Index][v2Index]=cost;
	}
	
	public int getNumOfVertices(){
		return vertices.size();
	}
	
	public int getNumOfEdges(){
		int count=0;
		
		for(int i=0;i<edges.length;i++){
			for(int j=0;j<edges[0].length;j++){
				if(edges[i][j]>0){
					count++;
				}
			}
		}
		
		return count; 
	}
	
	public void deleteEdge(int v1Index, int v2Index){
		edges[v1Index][v2Index]=0;
	}
}
