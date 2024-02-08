package br.dev.ferreiras.udemy.dsa.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

  public static void main(String[] args) {
    Graph graph = new Graph();
    boolean result = graph.addVertex("A");
    System.out.println(result);
    result = graph.addVertex("B");
    result = graph.addVertex("C");
    result = graph.addVertex("D");


    graph.addEdge("A", "B");
    graph.addEdge("A", "C");
    graph.addEdge("A", "D");
    graph.addEdge("B", "D");
    graph.addEdge("C", "D");

    graph.printGraph();
    graph.removeVertex("D");
    graph.printGraph();
  }

  public void printGraph() {
    System.out.println("Graph{" +
            "adjacentList=" + adjacentList +
            '}');
  }

  private final Map<String, List<String>> adjacentList = new HashMap<>();

  public boolean addVertex(String vertex) {
    if (adjacentList.get(vertex) == null) {
      adjacentList.put(vertex, new ArrayList<String>());
      return true;
    }
    return false;
  }

  public boolean addEdge(String vertex1, String vertex2) {
    if (adjacentList.get(vertex1) != null && adjacentList.get(vertex2) != null) {
      adjacentList.get(vertex1).add(vertex2);
      adjacentList.get(vertex2).add(vertex1);
      return true;
    }
    return false;
  }

  public boolean removeEdge(String vertex1, String vertex2) {
    if (adjacentList.get(vertex1) != null && adjacentList.get(vertex2) != null) {
      adjacentList.get(vertex1).remove(vertex2);
      adjacentList.get(vertex2).remove(vertex1);
      return true;
    }
    return false;
  }

  public boolean removeVertex(String vertex) {
    if (vertex == null) return false;
    for (String otherVertex : adjacentList.get(vertex)) {
      adjacentList.get(otherVertex).remove(vertex);
    }
    adjacentList.remove(vertex);
    return true;
  }
}

