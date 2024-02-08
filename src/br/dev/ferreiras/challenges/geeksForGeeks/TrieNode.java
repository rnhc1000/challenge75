package br.dev.ferreiras.challenges.geeksForGeeks;

public class TrieNode {

  boolean isWord;
  TrieNode[] children;

  public TrieNode() {
    isWord=false;
    children = new TrieNode[26];
  }
}
