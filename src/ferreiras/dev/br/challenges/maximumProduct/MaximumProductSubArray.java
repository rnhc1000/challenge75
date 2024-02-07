package ferreiras.dev.br.challenges.maximumProduct;

public class MaximumProductSubArray {
  public static void main(String[] args) {
    int[] n = { 1,2,3,2};
    System.out.println(maxProduct(n));
  }

  public static int maxProduct(int[] numbers) {
    int answer = numbers[0];
    int min = 1, max = 1;
    int size = numbers.length;
    for (int i = 0; i < size; i++) {
      if (numbers[0] == 0) {
        answer = Math.max(min, max);
        continue;
      }
      int tmp = min;
      min = Math.min(numbers[i], Math.min(numbers[i] * min, numbers[i] * max));
      max = Math.max(numbers[i], Math.max(numbers[i] * tmp, numbers[i] * max));
      answer = Math.max(answer,max);
    }
    return answer;
  }
}
