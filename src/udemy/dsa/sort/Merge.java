package udemy.dsa.sort;
import java.util.Arrays;
public class Merge {

  public static void main(String[] args) {
    int[] r = {1,3,5,6,9};
    int [] s = {2,4,7,8};
    int[] response = merge(r, s);
    System.out.println(Arrays.toString(response));
  }
  public static int[] merge(int[] array1, int[] array2) {
    int size1 = array1.length;
    int size2 = array2.length;
    int[] combined = new int[size1 + size2];
    int index = 0;
    int i = 0;
    int j = 0;
    while (i < size1 && j < size2) {
      if ((array1[i] < array2[j])) {
        combined[index] = array1[i];
        i++;
        index++;
      } else {
        combined[index] = array2[j];
        index++;
        j++;
      }
      while (i < size1) {
        combined[index] = array1[i];
        index++;
        i++;
      }
      while (j < size2) {
        combined[index] = array2[j];
        index++;
        j++;
      }
    }
    return combined;
  }
}
