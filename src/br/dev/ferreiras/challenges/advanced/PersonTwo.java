package br.dev.ferreiras.challenges.advanced;

public class PersonTwo {
  private String firstName;
  private String lastName;
  private boolean hideAddress;
  private Address address;

  @Override
  public String toString() {
    return "PersonTwo{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", hideAddress=" + hideAddress + '\'' +
            '}';
  }

  public PersonTwo(String firstName, String lastName, boolean hideAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.hideAddress = hideAddress;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public class Address {
    final private String street;
    final private String city;
    final private int houseNumber;

    public Address(String street, String city, int houseNumber) {
      this.street = street;
      this.city = city;
      this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
      return "Address{" +
              "street='" + street + '\'' +
              ", city='" + city + '\'' +
              ", houseNumber=" + houseNumber +
              '}';
    }

    public String getPublicAddress() {
      if (hideAddress) {
        return "Hidden";
      }
      return String.format("%d %s, %s", houseNumber, street, city);
    }
  }

  public static void main(String[] args) {
    PersonTwo person = new PersonTwo("Ricardo", "Ferreira", true);
    Address address = person.new Address("Santo Agapito", "Imperatriz", 7);

    System.out.println(person + " " + address);

  }
}

