import java.util.*;

public class GraphNode {
	int label;			//String label; 
	List<GraphNode> neighbors;
	
	public GraphNode(int label){
		this.label=label;
		neighbors=new ArrayList<>();
	}
	
}
