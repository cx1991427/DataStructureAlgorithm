package PG;

public class WordSearch {
	public boolean exist(char[][] board,String word){
		boolean[][] visited=new boolean[board.length][board[0].length];
		
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(helper(board,i,j,word,0,visited)){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean helper(char[][] board,int i,int j,String word,int k,boolean[][] visited){
		if(k==word.length()){
			return true;
		}
		if(i<0 || i>=board.length || j<0 || j>=board[0].length){
			return false;
		}
		if(visited[i][j]){
			return false;
		}
		if(board[i][j]==word.charAt(k)){
			if(helper(board,i,j,word,k+1,visited)){
				return true;
			}
			visited[i][j]=true;
			
			if(helper(board,i-1,j,word,k+1,visited)){
				return true;
			}
			if(helper(board,i+1,j,word,k+1,visited)){
				return true;
			}
			if(helper(board,i,j-1,word,k+1,visited)){
				return true;
			}
			if(helper(board,i,j+1,word,k+1,visited)){
				return true;
			}
			if(helper(board,i-1,j-1,word,k+1,visited)){
				return true;
			}
			if(helper(board,i-1,j+1,word,k+1,visited)){
				return true;
			}
			if(helper(board,i+1,j-1,word,k+1,visited)){
				return true;
			}
			if(helper(board,i+1,j+1,word,k+1,visited)){
				return true;
			}
			
			visited[i][j]=false;
			
			return false;
		}
		else{
			return false;
		}
	}
}
