package GeeksForGeeks;

public class TrieNode {

  boolean isWord;
  TrieNode[] children;

  public TrieNode() {
    isWord=false;
    children = new TrieNode[26];
  }
}
