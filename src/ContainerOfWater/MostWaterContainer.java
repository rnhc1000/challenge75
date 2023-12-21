package ContainerOfWater;

import java.util.Arrays;

public class MostWaterContainer {

  public static void main(String[] args) {
    int[] height = {1,2,1};
    System.out.println(maxArea(height));
  }
  public static int maxArea(int[] data) {
    int areaContainer=0;
    int[] aux = new int[data.length];
    int max = Integer.MIN_VALUE;
    int min = max-1;
    int height = 0, pointA=0, pointB=0, width =0;
    int size = data.length;
    for (int i = 0; i < size; i++) {
      if (data[i] > max) {
        max = data[i];
        pointA = i;
      }
    }
    System.out.println(max +  " " + pointA);

    for (pointA+=1; pointA < size; pointA++) {

      aux[pointA] = pointA*max;

    }

    for (int j = 0; j <aux.length; j++) {
      min = Integer.MIN_VALUE;
      if (aux[j] > min) {
        min=aux[j];
        pointB = j;
      }
    }

    pointB = data[pointB];




    System.out.println(Arrays.toString(aux));
    System.out.println(min + " " + pointB);

    while (pointA > pointB) {

      pointA--;

    }
    areaContainer = pointA * pointB;
    return areaContainer;
  }
}
