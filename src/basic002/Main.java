package basic002;

/**
 * 피보나치 수열을 출력하시오
 *
 * An = A(n-1) + A(n-2)
 */
public class Main {
    public static void main(String[] args) {

        int[] fibo = new int[10];
        fibo[0] = 1;
        fibo[1] = 1;

        for(int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int f : fibo) {
            System.out.print(f + " ");
        }
    }
}
