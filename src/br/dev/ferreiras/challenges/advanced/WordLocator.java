package br.dev.ferreiras.challenges.advanced;

public class WordLocator {
  /*
    public record WordLocation(int row, int column) {
  }
   */
    public static class WordLocation {
      private final int row;
      private final int column;

      public WordLocation(int row, int column) {
        this.row = row;
        this.column = column;
      }

      public int getRow() {
        return row;
      }

      public int getColumn() {
        return column;
      }
    }

    public static WordLocation find(String[][] names, String name) {
      int row = 0, col = 0;
      for (row = 0; row < names.length; row++) {
        for (col = 0; col < names[0].length; col++) {
          if (names[row][col].equals(name)) {
            break;
          }
        }
      }
      return new WordLocation(row, col);
    }

  public static void main(String[] args) {
    String[][] names = {
            {"Alice", "John", "Bob"},
            {"Charlie", "Bill", "Ben", "John"},
            {"John", "Brian", "John"}
    };
    WordLocation location = WordLocator.find(names, "John");
    System.out.println("row: " + location.getRow() + " col: " + location.getColumn());
    /*
    The break statement is present only inside the inner for-loop. So, the above code
    will always find the col value of the first occurrence of a name in the last row
    (in this case, row=2, col=0  for “John”  ) and then increment the row value to
    row++ (row=3) and come out of the outer for-loop.

    So the output value will be row: 3 col: 0
     */
  }
}
