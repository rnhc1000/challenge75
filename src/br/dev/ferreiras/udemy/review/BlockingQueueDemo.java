package br.dev.ferreiras.udemy.review;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static br.dev.ferreiras.udemy.review.BlockingQueueDemo.logger;

public class BlockingQueueDemo {

  static BlockingQueue<Obj> bq = new LinkedBlockingQueue<Obj>(100);
  public static Logger logger = Logger.getLogger(BlockingQueueDemo.class.getName());

  public static void main(String[] args) {

    Thread threadOne = new Thread(new Producers(bq));

    threadOne.start();

    Thread threadTwo = new Thread(new Consumers(bq));

    threadTwo.start();

  }


}
class Producers implements Runnable {
  BlockingQueue bq;

  Producers(BlockingQueue bq) {
    this.bq = bq;
  }

  @Override
  public void run() {

    for (int i = 0; i < 50; i++) {

      Obj o = new Obj(""+i);
      System.out.println("Producing items " + o);

      try {
        bq.put(o);
      } catch (InterruptedException ex) {
        logger.info("Exception" + ex);
      }

    }

  }
}

class Consumers implements Runnable {
  BlockingQueue bq;

  Consumers(BlockingQueue bq) {
    this.bq = bq;
  }

  @Override
  public void run() {

    for (int i = 0; i < 50; i++) {

      Obj o = null;
      try {
        o = (Obj)bq.take();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Consuming items " + o);

    }

  }
}

class Obj {
  private String name;
  Obj(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Obj{" +
           "name='" + name + '\'' +
           '}';
  }
}
