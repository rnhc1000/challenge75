package ferreiras.dev.br.udemy.dsa.hashTable;

public class Node {
  private String key;
  private Integer value;
  Node next;

  public Node(String key, Integer value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" +
            "key='" + key + '\'' +
            ", value=" + value +
            ", next=" + next +
            '}';
  }
}
