package br.dev.ferreiras.challenges.izatec;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Parcelamento {
  private final Integer numeroParcela;
  private final Double valorTotal;
  private final LocalDateTime dataVencimento;
  private static int parcela = 0;

  static class Mix {
    Integer number;

    @Override
    public String toString() {
      return "Mix{" +
             "number=" + number +
             ", character=" + character +
             '}';
    }

    Character  character;

    public Mix(Integer number, Character character) {
      this.number = number;
      this.character = character;
    }

    public static Set<Mix> of (Integer number, Character character) {

      Set<Mix> num = new HashSet<>();
      int count = 50;
      Random random = new Random();
      for (int i = 0; i < count; i++) {
        char c = (char) (random.nextInt(26) + 'a');
        System.out.println(c);
        num.add( new Mix(random.nextInt(26), c));
      }


      return num;
    }


  }
  public static List<Parcelamento> of(Integer numeroParcelas, Double valorTotal, LocalDateTime dataVencimento ) {
    parcela = 1;
    List<Parcelamento> parcelas = new ArrayList<>();
    BigDecimal valorRestante = new BigDecimal(valorTotal);
    do {
      BigDecimal valorParcela = new BigDecimal(valorTotal).divide(new BigDecimal(numeroParcelas),2, RoundingMode.HALF_EVEN);
      parcelas.add(new Parcelamento (
              parcela == numeroParcelas ? valorRestante.doubleValue() : valorParcela.doubleValue(),
              dataVencimento = dataVencimento.plusMonths(1)));
      valorRestante = valorRestante.subtract(valorParcela);
    }
    while ( parcela <= numeroParcelas );
    return parcelas;
  }




  public Parcelamento(Double valorTotal, LocalDateTime dataVencimento) {
    this.numeroParcela = parcela++;
    this.valorTotal = valorTotal;
    this.dataVencimento = dataVencimento;
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return "Parcelamento{" +
           "numeroParcela=" + numeroParcela +
           ", valorTotal=" + valorTotal +
           ", dataVencimento=" + dataVencimento.format(formatter) +
           '}';
  }

  public static void main(String[] args) {
    List<Parcelamento> parcelas = Parcelamento.of(3, 10.0, LocalDateTime.now());
    Set<Mix> nums = Mix.of( 17,'c');
    parcelas.forEach(System.out::println);
    nums.forEach(System.out::println);
  }

}
