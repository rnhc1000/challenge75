package br.dev.ferreiras.challenges.advanced;

public class EnumHandling {

  enum DayOfWeek {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6);

    private final int day;

    DayOfWeek(int day) {
      this.day = day;
    }

    public int getDay() {
      return this.day;
    }
  }
  enum Element {
    HELIUM("He", "Gas"),
    MAGNESIUM("Mg", "Solid");

    private final String chemicalSymbol;
    private final String naturalState;

    private Element(String newChemicalSymbol, String naturalState) {
      chemicalSymbol = newChemicalSymbol;
      this.naturalState = naturalState;
    }

    public String chemicalSymbol() {
      return chemicalSymbol;
    }

    public String naturalState() {
      return naturalState;
    }
  }

  public static void main(String[] args) {
    System.out.printf("%s, %s, %s",
            Element.HELIUM.toString(),
            Element.HELIUM.chemicalSymbol(),
            Element.HELIUM.naturalState()
    );

    System.out.println("\n------------------------------------");

    System.out.printf("%s, %s, %s",
            Element.MAGNESIUM.toString(),
            Element.MAGNESIUM.chemicalSymbol(),
            Element.MAGNESIUM.naturalState()
    );

    System.out.println("\n------------------------------------");

    // DayOfWeek SUN = new DayOfWeek(7);
    System.out.printf("%d, %d" ,
            DayOfWeek.MON.getDay(),
            DayOfWeek.SAT.getDay()
    );
  }
}
