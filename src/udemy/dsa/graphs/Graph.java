package udemy.dsa.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
  private Map<String, List<String>> adjacentList = new HashMap<>();

  public boolean addVertex(String vertex) {
    if (adjacentList.get(vertex) == null) {
      adjacentList.put(vertex, new ArrayList<String>());
      return true;
    }
    return false;
  }
}
