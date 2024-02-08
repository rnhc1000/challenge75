package br.dev.ferreiras.udemy.dsa.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
  private List<Integer> heap;


  public Heap() {
    this.heap = new ArrayList<>();
  }

  public List<Integer> getHeap() {
    return new ArrayList<>(heap);
  }

  private Integer leftChild(Integer index) {
    return 2 * index + 1;
  }

  private Integer rightChild(Integer index) {
    return 2 * index + 2;
  }

  private Integer parent(Integer index) {
    return (index - 1) / 2;
  }

  private void swap(Integer indexOne, Integer indexTwo) {
    int temp = heap.get(indexOne);
    heap.set(indexOne, heap.get(indexTwo));
    heap.set(indexTwo, temp);
  }

  public void insert(Integer value) {
    heap.add(value);
    int current = heap.size() - 1;
    while (current > 0 && heap.get(current) > heap.get(parent(current))) {
      swap(current, parent(current));
      current = parent(current);
    }
  }

  public Integer remove() {
    if (heap.isEmpty()) return null;
    if (heap.size() == 1) {
      return heap.remove(0);
    }
    int maxValue = heap.get(0);
    heap.set(0, heap.remove(heap.size() - 1));
    sinkDown(0);
    return maxValue;
  }

  public void sinkDownn(Integer index) {
    int maxIndex = index;
    while(true) {
      int leftIndex = leftChild(index);
      int rightIndex = rightChild(index);
      if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(rightIndex)) {
        maxIndex = leftIndex;
      }
      if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(leftIndex)) {
        maxIndex = rightIndex;
      }
      if (maxIndex != index) {
        swap( index,maxIndex);
        index = maxIndex;
      } else {
        return;
      }
    }
  }
  private void sinkDown(int index) {
    int maxIndex = index;
    while (true) {
      int leftIndex = leftChild(index);
      int rightIndex = rightChild(index);

      if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
        maxIndex = leftIndex;
      }

      if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
        maxIndex = rightIndex;
      }

      if (maxIndex != index) {
        swap(index, maxIndex);
        index = maxIndex;
      } else {
        return;
      }
    }
  }
}

