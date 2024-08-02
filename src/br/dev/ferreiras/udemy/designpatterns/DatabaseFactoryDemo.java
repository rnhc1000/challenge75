package br.dev.ferreiras.udemy.designpatterns;

public class DatabaseFactoryDemo {

  public static void main(String[] args) {
    Database db = null;
    db = DatabaseFactory.getDatabase("DBMS");
    System.out.println("Database is: " + db.getClass());
    System.out.println(db.connect());

    db = DatabaseFactory.getDatabase("RDBMS");
    System.out.println("Database is: " + db.getClass());
    System.out.println(db.connect());
  }
}
