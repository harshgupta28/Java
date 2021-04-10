//Java implementation of search and insert operations 
//on Trie 
public class Trie { 
	
	// Alphabet size (# of symbols) 
	static  int ALPHABET_SIZE = 26; 
	
	// trie node 
	 static class TrieNode 
	{ 
		TrieNode children[] = new TrieNode[ALPHABET_SIZE]; 
	
		// isEndOfWord is true if the node represents 
		// end of a word 
		boolean isEndOfWord; 
		
		TrieNode(){ 
			isEndOfWord = false; 
			for (int i = 0; i < ALPHABET_SIZE; i++) 
				children[i] = null; 
		} 
	}; 
	
	static TrieNode root; 
	
	// If not present, inserts key into trie 
	// If the key is prefix of trie node, 
	// just marks leaf node 
	static void insert(String key) 
	{ 
		 TrieNode temp = root; 
		for (int level = 0; level < key.length(); level++) 
		{ 
			int index = key.charAt(level) - 'a'; 
			if (temp.children[index] == null) 
				temp.children[index] = new TrieNode(); 
	
			temp = temp.children[index]; 
		} 
		// mark last node as leaf 
		temp.isEndOfWord = true; 
	} 
	
	// Returns true if key presents in trie, else false 
	static boolean search(String key) 
	{ 
		TrieNode temp = root; 
		for (int level = 0; level < key.length(); level++) 
		{ 
			int index = key.charAt(level) - 'a'; 
			if (temp.children[index] == null) 
				return false; 
	
			temp = temp.children[index]; 
		} 
		return (temp != null && temp.isEndOfWord); 
	} 
	
	// Driver 
	public static void main(String args[]) 
	{ 
		// Input keys (use only 'a' through 'z' and lower case) 
		String keys[] = {"the", "a", "there", "answer", "any", 
						"by", "bye", "their"}; 
	
		String output[] = {"Not present in trie", "Present in trie"}; 
	
	
		root = new TrieNode(); 
	
		// Construct trie 
		for (int i = 0; i < keys.length ; i++) 
			insert(keys[i]); 
		
	
		// Search for different keys 
		if(search("the") == true) 
			System.out.println("the --- " + output[1]); 
		else System.out.println("the --- " + output[0]); 
		
		if(search("these") == true) 
			System.out.println("these --- " + output[1]); 
		else System.out.println("these --- " + output[0]); 
		
		if(search("their") == true) 
			System.out.println("their --- " + output[1]); 
		else System.out.println("their --- " + output[0]); 
		
		if(search("thaw") == true) 
			System.out.println("thaw --- " + output[1]); 
		else System.out.println("thaw --- " + output[0]); 
		
	} 
} 


