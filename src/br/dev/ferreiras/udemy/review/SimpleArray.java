package br.dev.ferreiras.udemy.review;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class SimpleArray {

  private static final Logger logger = Logger.getLogger(SimpleArray.class.getName());
  private int writeIndex = 0;
  private final int[] array;
  private final static Random random = new Random();

  public SimpleArray(int size) {
    array = new int[size];
  }

  public synchronized void add( int value) {
    int position = writeIndex;
    try {
      long timeout = random.nextInt(5000);
      logger.info(String.format("waiting for %4d  ms", timeout));
      Thread.sleep(timeout);
      Thread.currentThread().setName("threadRferreira");
    } catch (InterruptedException ex) {
      logger.info("Interrupted Exception");
    }
    array[position] = value;
    System.out.printf("%s wrote %2d to element %d, \n",
            Thread.currentThread().getName(), value, position);
    ++writeIndex;
    System.out.printf(" Next write index: %d\n", writeIndex);
  }

  public String toString(){
    return "\n Contents of SimpleArray:\n" + Arrays.toString(array);
  }

}