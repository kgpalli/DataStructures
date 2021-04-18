package dst.BST;

import java.util.LinkedList;
import java.util.List;

class SuffixTrieNode{
    final  static int MAX_CHAR = 256;
    SuffixTrieNode [] children = new SuffixTrieNode[MAX_CHAR];
    public List<Integer>indexes;

    public SuffixTrieNode(){
        // Create an empty linked list for indexes of
        // suffixes starting from this node
        indexes = new LinkedList<>();

        // Initialize all child pointers as NULL
        for(int i=0;i<MAX_CHAR;i++){
            children[i] = null;
        }

    }

    void insertSuffix(String s , int index){
        indexes.add(index);
        if(s.length()>0){
            char cIndex = s.charAt(0);
            // If there is no edge for this character,
            // add a new edge
            if(children[cIndex] == null)
                children[cIndex] = new SuffixTrieNode();
                // Recur for next suffix
                children[cIndex].insertSuffix(s.substring(1),index+1);

        }
    }

    // A function to search a pattern in subtree rooted
    // with this node.The function returns pointer to a
    // linked list containing all indexes where pattern
    // is present. The returned indexes are indexes of
    // last characters of matched text.

    List<Integer>search(String s){
        // If all characters of pattern have been processed,
        if(s.length()==0) return indexes;
        // if there is an edge from the current node of suffix tree, follow the edge.
        if(children[s.charAt(0)] != null)
            return children[s.charAt(0)].search(s.substring(1));
            // If there is no edge, pattern doesnt exist in
            // text
        else
            return null;
    }
}

public class SuffixTrie {
    SuffixTrieNode root = new SuffixTrieNode();

    SuffixTrie(String txt){
        for(int i=0;i<txt.length();i++){
            // Consider all suffixes of given string and
            // insert them into the Suffix Trie using
            // recursive function insertSuffix() in
            // SuffixTrieNode class
            root.insertSuffix(txt.substring(i),i);
        }
    }

    void search_tree(String pat){
        // Let us call recursive search function for
        // root of Trie.
        // We get a list of all indexes (where pat is
        // present in text) in variable 'result'

        List<Integer>result = root.search(pat);

        // Check if the list of indexes is empty or not
        if(result==null){
            System.out.println("Pattern not found");
        }
        else{
            int patLen = pat.length();
            for(int i:result){
                System.out.println("Pattern found at position " + (i=patLen));
            }
        }
    }

    public static void main(String args[]) {

        // Let us build a suffix trie for text
        // "geeksforgeeks.org"
        String txt = "geeksforgeeks.org";
        SuffixTrie S = new SuffixTrie(txt);

        System.out.println("Search for 'ee'");
        S.search_tree("ee");

        System.out.println("\nSearch for 'geek'");
        S.search_tree("geek");

        System.out.println("\nSearch for 'quiz'");
        S.search_tree("quiz");

        System.out.println("\nSearch for 'forgeeks'");
        S.search_tree("forgeeks");
    }
}


