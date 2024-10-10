package br.dev.ferreiras.udemy.review;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.logging.Logger;


public class NIOClass {

  private final  static Logger logger = Logger.getLogger(NIOClass.class.getName());
  public static void main(String[] args) {

    String file = "/home/rferreira/dev/challenge75/bestCommitPractices.sh";

    try (FileInputStream input = new FileInputStream(file)) {

      logger.info("Preparing Channel....");

      ReadableByteChannel readableByteChannel = input.getChannel();

      ByteBuffer buffer = ByteBuffer.allocate(1024*1000);
      logger.info("Buffer Allocated... 1024 x 100...");

      while (readableByteChannel.read(buffer) != -1) {

        buffer.flip();
        while(buffer.hasRemaining()) {
          logger.info("Reading buffer...");
          System.out.println(buffer.get());
        }

        buffer.clear();

       }
    } catch (IOException ex) {
      System.out.println(ex.getMessage());

    }
  }
}
