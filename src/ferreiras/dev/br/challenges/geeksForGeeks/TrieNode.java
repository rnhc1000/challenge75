package ferreiras.dev.br.challenges.geeksForGeeks;

public class TrieNode {

  boolean isWord;
  TrieNode[] children;

  public TrieNode() {
    isWord=false;
    children = new TrieNode[26];
  }
}
