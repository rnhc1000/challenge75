package br.dev.ferreiras.udemy.review;

import java.io.*;

public class SerializeClass {

  public static void main(String[] args) {

    MySerializableClass mySerializableClass = new MySerializableClass();
    mySerializableClass.i = 10;
    mySerializableClass.s = "Ricardo Ferreira";
    try (FileOutputStream fos = new FileOutputStream("myFile.ver")) {
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(mySerializableClass);

    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }

    MySerializableClass obj;
    try (FileInputStream fis = new FileInputStream("myFile.ver")) {
      ObjectInputStream ois = new ObjectInputStream(fis);
      obj = (MySerializableClass) ois.readObject();

    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Object data: i is: " + obj.i + " and " + "s is: " + obj.s);

  }
}

