package br.dev.ferreiras.challenges.codility;

public class ChocolateByNumbers {

    public static int solution(int n, int m) {

        // main idea:
        // using "gcd(m, n)"
        // the number of eaten chocolates = N / gcd(m,n)
        return n/(gcd(n,m));
    }

    // using "Euclidean Algorithm" (important)
    public static int gcd(int a,int b){
        if(a % b == 0)
            return b;            // case 1
        else
            return gcd(b,a % b); // case 2 (key point)
    }

    public static void main(String[] args) {
        int n = 28, m =576;

        int response = solution(n, m);
        System.out.println(response);
    }
}
