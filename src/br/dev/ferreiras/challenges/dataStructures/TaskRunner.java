package br.dev.ferreiras.challenges.dataStructures;

import java.sql.SQLSyntaxErrorException;

public class TaskRunner {

  public static void main(String[] args) {
    long startTime = System.nanoTime();
    long start = System.currentTimeMillis();
    TaskRunner runner = new TaskRunner();
    int result = runner.runTasks(100_000_000);
    long endTime = System.nanoTime();

    long duration = (endTime - startTime) / 1_000_000;
    long end = System.currentTimeMillis();
    System.out.println("Result: " + result);
    System.out.println("Execution time: " + duration + " ms");
    System.out.println(end - start + " ms");
  }
  public int runTasks(int numberOfTasks) {
    int result =0;
    for (int i = 0; i < numberOfTasks; i++) {
      SimpleTask task = new SimpleTask(i);
      result += task.compute();
    }
    return result;
  }


  static class SimpleTask {
    private final int value;
    public SimpleTask(int value) {
      this.value = value;
    }

    public int compute() {
      return (value * 31 ) % 7;
    }
  }
}
