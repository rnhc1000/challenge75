package br.dev.ferreiras.challenges.advanced;

class EmployeeOne {
  private int id;
  private String name;
  private int salary;

  public EmployeeOne(int id, String name) {
    this.id = id;
    this.name = name;
    this.salary = 50;
  }

  public EmployeeOne(int id, String name, int salary) {
    this(id, name);
    this.salary = salary;
//    this(id, name); must be the first one
    /*
Any constructor of a class can invoke any other constructor using the this() keyword.

This is called Constructor Chaining.

But this() call should be the first call in a constructor, otherwise a there is a compilation error:

java: call to this must be first statement in constructor
     */
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getSalary() {
    return salary;
  }
}

