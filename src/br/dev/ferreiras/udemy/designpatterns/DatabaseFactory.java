package br.dev.ferreiras.udemy.designpatterns;

public class DatabaseFactory {

  public static Database getDatabase(String dbType) {
    Database dc = null;
    if ("RDBMS".equalsIgnoreCase(dbType)) {
      dc = new RDBMS();
    } else {
      dc = new DBMS();
    }
    return dc;
  }

}
class DBMS implements Database {
  @Override
  public String connect() {
    return "Connection Successful to DBMS Database!";
  }
}

  class RDBMS implements Database {
    @Override
    public String connect() {
      return "Connection Successful to RDBMS Database";
    }
  }

  interface Database {
    public String connect();
  }

