//
//public class Trie {
//
//}
//
//class TrieNode{
//	public TrieNode[] next;
//	
//	public TrieNode(){
//		
//	}
//}

public class TrieTree{
	//1:inner class
	public class TrieNode{
		
		public boolean isWord;
		public TrieNode[] child;
		
		public TrieNode(){
			child=new TrieNode[26];
		}
	}
	
	//2:attribute
	TrieNode root;
	
	//3:constructor
	public TrieTree(){
		root=new TrieNode();
	}
	
	//4:insert a word into trie
	public void insertWord(String word){
		TrieNode node=root;
		for(int i=0;i<word.length();i++){
			if(node.child[word.charAt(i)-'a']==null){
				node.child[word.charAt(i)-'a']=new TrieNode();
			}
			node=node.child[word.charAt(i)-'a'];
		}
		node.isWord=true;
	}
	
	//5:build trie
	public void buildTrie(String[] words){
		for(String word:words){
			insertWord(word);
		}
	}
	
	public boolean search(String word){
		TrieNode node=root;
		for(int i=0;i<word.length();i++){
			char ch=word.charAt(i);
			if(node.child[ch-'a']==null){
				return false;
			}
			node=node.child[ch-'a'];
		}
		return node.isWord;
	}
	
	public boolean startWith(String prefix){
		TrieNode node=root;
		for(int i=0;i<prefix.length();i++){
			if(node.child[prefix.charAt(i)-'a']==null){
				return false;
			}
			node=node.child[prefix.charAt(i)-'a'];
		}
		return true;
	}
}