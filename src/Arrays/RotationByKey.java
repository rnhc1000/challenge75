package Arrays;

/**
 * Given an array of integers of size N and a Key K,
 * rotate it to the right (K > 0)
 */
public class RotationByKey {
  public static void main(String[] args) {
    int[] toRotate = {1,2,3,4,5,6,7,8,9};
    int k = 13;
    int[] rotated = rotateArray(toRotate,k);
    System.out.print("\n---------------------\n");
    for (int i : rotated){
      System.out.print(" " + i);
    }
  }
  public static int[] rotateArrayRight(int[] toBeRotated, int key) {
    int len = toBeRotated.length;
    if (key > len) {

      key = key % len;

    }
    System.out.println("Key: " + key);
    int[] response = new int[toBeRotated.length];
    int size = toBeRotated.length-1;

    int[] phaseOne = new int[toBeRotated.length];
    int j = 0;
    for (int i = size; i >=0; i--){
      phaseOne[j] = toBeRotated[i];
      j++;
    }
    int [] phaseTwo = new int[key];
    j=0;
    for(int i = key-1; i >= 0; i--) {
      phaseTwo[j] = phaseOne[i];
      j++;
    }
    int remaining = toBeRotated.length - key;
    int[] phaseThree = new int[remaining];
    j=phaseOne.length-1;
    for (int i = 0 ; i < phaseThree.length; i++) {
      phaseThree[i] = phaseOne[j];
      j--;
    }

    for (int i = 0; i< phaseTwo.length; i++) {

      phaseOne[i] = phaseTwo[i];
    }
    j=0;
    for (int i = phaseTwo.length; i<phaseOne.length; i++) {
      phaseOne[i] = phaseThree[j];
      j++;
    }
    for (int i : phaseTwo) {
      System.out.print(" "+ i);
    }
    System.out.println();
    for (int i : phaseThree) {
      System.out.print(" "+ i);
    }

    return phaseOne;
  }

  public static int[] rotateArray(int[] toBeRotated, int key) {
    int size = toBeRotated.length;
    int[] rotatedArray = new int[size];
    /**
     * check if key is longer than the array size:
     * This will assure it will rotate only the necessary.
     * key = key % array.length
     * e.g. array size = 10; key = 12;
     * key = 12 % 10 = 2 rotations only....
     * key = 3 % 10 = 3 ....
     */

    key = key % size;
    revertArrays(toBeRotated,0,size-1);
    revertArrays(toBeRotated,0,key-1);
    revertArrays(toBeRotated, key, size - 1);

    return toBeRotated;
  }


  public static int[] revertArrays(int[] numbers, int start, int end) {
    while (start < end) {
      int floating = numbers[start];
      numbers[start] = numbers[end];
      numbers[end] = floating;
      start++;
      end--;
    }
    return numbers;
  }
}
