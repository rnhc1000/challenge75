package br.dev.ferreiras.challenges.hackerrank;

public class IpAddressRegex {

  public static void main(String[] args) {
    String ipAddress= "1.1.1.1";
    boolean response = regexIpv4(ipAddress);
    System.out.println(response);
  }
  public static boolean regexIpv4(String ipAddress) {

    String regex = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
    String regexOne = "(\\d{1,3}\\.){3}\\d{1,3}";



    return ipAddress.matches(regexOne);
  }
}
