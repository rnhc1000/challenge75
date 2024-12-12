package br.dev.ferreiras.challenges.containerOfWater;

public class MostWaterContainer {

  public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(height));
  }
  public static int maxArea(int[] height) {
    int areaContainer = 0;
    int left = 0;
    int right = 0;
    int size = height.length;
    right = size - 1;
    while (left < right) {
      int minHeight = Math.min(height[left], height[right]);
      areaContainer = Math.max(areaContainer, minHeight * (right - left)); // minimum amount of water
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }

    return areaContainer;
    /*
    int[] aux = new int[height.length];
    int max = Integer.MIN_VALUE;
    int min = max-1;
    int pointA=0, pointB=0, width =0;
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




    System.out.println(arraysOne.toString(aux));
    System.out.println(min + " " + pointB);

    while (pointA > pointB) {

      pointA--;

    }
    areaContainer = pointA * pointB;
    return areaContainer;
  }
  */
  }
}
