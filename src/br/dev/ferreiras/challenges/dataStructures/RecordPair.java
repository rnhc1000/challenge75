package br.dev.ferreiras.challenges.dataStructures;

public class RecordPair {
  String key;
  Integer value;

  public RecordPair(String key, Integer value) {
    this.key = key;
    this.value =  value;
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
    return "RecordPair{" +
            "key='" + key + '\'' +
            ", value=" + value +
            '}';
  }
}
