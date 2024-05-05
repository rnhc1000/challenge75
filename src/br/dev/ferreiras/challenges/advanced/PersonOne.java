package br.dev.ferreiras.challenges.advanced;
/*
This code will indeed not compile because the static nested class Address does not have access
to the hidden field that belongs to the Person class.

Only non-static nested classes have access to their outer class members.
 */
public class PersonOne {
    private String firstName;
    private String lastName;
    private boolean hideAddress;
    private Address address;

    public PersonOne(String firstName, String lastName, boolean hideAddress, Address address) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.hideAddress = hideAddress;
      this.address = address;
    }

      public static class Address {
      private String street;
      private String city;
      private int houseNumber;

      public String getPublicAddress() {
//        if (hideAddress) {
//          return "Hidden";
//        }
        return String.format("%d %s, %s", houseNumber, street, city);
      }
    }

  public static void main(String[] args) {
/*
java: non-static variable hideAddress cannot be referenced from a static context
 */
  }
  }

