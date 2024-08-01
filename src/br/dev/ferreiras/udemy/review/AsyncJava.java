package br.dev.ferreiras.udemy.review;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncJava {


  public static void main(String[] args) {


    ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    CompletableFuture.supplyAsync(()-> BigDecimal.valueOf(10247681024768L))
            .thenApplyAsync(AsyncJava::addOne, es)
            .thenApplyAsync(AsyncJava::addOne, es)
            .thenApplyAsync(AsyncJava::addOne, es)
            .exceptionally(throwable -> BigDecimal.valueOf(handleIt(throwable)))
            .thenAcceptAsync(System.out::println,es)
            .thenRunAsync(es::shutdown);

  }

  public static BigDecimal addOne (BigDecimal num) {
    return num.add(num);
  }

  public static int handleIt(Throwable t) {
    System.out.println("Exception Occurred...." + t);
    return 0;
  }
}
