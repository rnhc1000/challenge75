package br.dev.ferreiras.udemy.dsa.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
pathToHeaven(fee, n){
	Initialize min_fee[n+1], previous[n+1] as new arrays

	// Base cases
	min_fee[0] = 0
	min_fee[1] = min_fee[2] = fee[0]
	previous[0] = -1
	previous[1] = previous[2] = 0

        for i from 3 upto n:
		min_fee[i] <- min( min_fee[i-1] + fee[i-1],
			     	   min_fee[i-2] + fee[i-2],
			           min_fee[i-3] + fee[i-3] )
		if min_fee[i] = min_fee[i-1] + fee[i-1]) :
			previous[i] = i-1
		else if min_fee[i] = min_fee[i-2] + fee[i-2] :
			previous[i] = i-2
		else
			previous[i] = i-3

	j = n
	while j is NOT 0 :
  		print(j + "->")
		j = previous[j]

  	print(0)
}
 */
public class StairwayToHeaven {

  public static void main(String[] args) {
    int[] fee = {2,1,3,1,2};

    int steps = 5;

    int[] response = stairWayToHeaven(steps, fee);
    System.out.println(Arrays.toString(response));
  }

  public static int[] stairWayToHeaven(int steps, int[] fee) {

    int[] minFee = new int[steps + 1];
    minFee[0] = 0;
    minFee[1] = fee[0];
    minFee[2] = fee[0];

    for (int i = 3; i <= steps ; i++) {
       int tempFee = Math.min(minFee[i-1] + fee[i-1], minFee[i-2] + fee[i-2]);
       minFee[i] = Math.min(tempFee, minFee[i-3] + fee[i-3]);
    }
    List<Integer> path = new ArrayList<>();
    path.add(0);
    path.add(minFee[steps]);
    path.add(steps);
//    System.out.println(path);
    System.out.println(Arrays.toString(minFee));

    return path.stream().mapToInt(x -> x).toArray();
    //return minFee[steps];
  }
}
